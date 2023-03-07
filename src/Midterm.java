import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Midterm {
    private static Pantry wegot = new Pantry(); //Create instance of pantry with label wegot b/c it's what we got
    public static void main(String[] args){
        buildPantry(); //Build up the pantry list
        recipeCheck(); //Check all the recipes in the folder, see if we can make them
    }

    private static void buildPantry() { //Build up the pantry list function
        String item;
        float amount;

        try {
            File list = new File("Groceries.txt");
            Scanner scan = new Scanner(list).useDelimiter(",|\r\n");

            while(scan.hasNext()) {
                item = scan.next();
                amount = scan.nextFloat();
                wegot.add(item,amount); //Add each item and quantity 
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("No file found.");
        }
    }

    private static void recipeCheck() { //Check if we can make the recipe with what we got
        String name; //Name of recipe
        String item; //Name of item needed
        float amount; //Number of item we have
        float needed; //Number of item we need
        boolean fileExists = true;
        int i = 1; //Start at recipe number 1
        
        while(fileExists){ //As long as the file exists, go through it and check if we have the ingredients needed
            try {
                File list = new File("Recipe"+i+".txt"); //State which recipe we're looking for by recipe number
                i++; //Increase recipe number for next run
                Scanner scan = new Scanner(list).useDelimiter(",|\r\n"); //Set up scanner to read recipe
                name = scan.nextLine(); //Grab the recipe name from the top of the file
                boolean canMake = true;
                while(scan.hasNext()){ //Go through each item needed in the recipe
                        item = scan.next(); //Which item are we in need of
                        needed = scan.nextFloat(); //How much of the item do we need
                        amount = wegot.getQuantity(item); //Find out how much of the item we have
                        if(amount<needed){ //If we don't have enough of something, print out that we don't have enough to make this recipe
                            System.out.println("We don't have enough ingredients to make "+name+".");
                            canMake = false;
                            scan.close();
                            break; //Don't bother going through the rest of the recipe that can't be made
                        }
                }
                if(canMake){System.out.println("We can make "+name+"!");} //Hooray! We can make this recipe
                scan.close();
            }
            catch(FileNotFoundException e) {
                System.out.println("Reached end of recipes."); //Let us know we've gone through all the recipes in the folder
                fileExists = false; //Bring this program to a close
            }
        }
    }
}
