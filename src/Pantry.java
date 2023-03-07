import java.util.Objects;
import java.util.LinkedList;

public class Pantry {
    private static LinkedList ingredients = new LinkedList<>();

    public static void add(String name, float quantity){
        Ingredient item = new Ingredient(name, quantity);
        ingredients.add(item); //Adds ingredients to the pantry ingredients list
        //System.out.println(ingredients.size());
        for(int i=0; i<ingredients.size(); i++){
            //Ingredient test = ingredients.get(i);
        }
    }

    public static int getQuantity(String name){
        for(int i=0; i<ingredients.size(); i++){
            Ingredient item = ingredients.get(i);
            if(ingredients.get(i).name==name){

            }
        }
    }

    public static int length(){ //Returns base 1 length
        return ingredients.size();
    }
/*
    public static boolean has(String name){ //Retruns true if the name is in the queue
        boolean inqueue = false;
        for (int i=0; i<queue.length; i++){
            if(Objects.equals(queue[i].name.toLowerCase(), name.toLowerCase())){
                inqueue = true;
                break;
            }
        }
        return inqueue;
    }

    public static void show(){ //This is just for troubleshooting purposes, will remove before turning in. Prints out the current queue
        int i = 0; 
        int qL = queue.length;

        if(queue[i]==null){System.out.println("The queue is empty.");}
        else{
            System.out.println("Current Queue:");
            while(i<queue.length){
                System.out.println(i+1 + " " + queue[i].name + ", " + queue[i].reason + ", " + queue[i].time);
                i++;
            }
        }        
    }*/
}
