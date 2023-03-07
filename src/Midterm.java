import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;

public class Midterm {
    private static Pantry wegot = new Pantry(); //Create instance of pantry with label wegot b/c it's what we got
    public static void main(String[] args){
        buildPantry(); //Build up the pantry list
    }
    private static void buildPantry() { //Build up the pantry list function
        String name;
        float amount;

        try {
            File list = new File("Groceries.txt");
            Scanner scan = new Scanner(list).useDelimiter(",|\r\n");

            while(scan.hasNext()) {
                name = scan.next();
                amount = scan.nextFloat();
                wegot.add(name,amount);
            }
            scan.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("No file found.");
            e.printStackTrace();
        }
    }
}
