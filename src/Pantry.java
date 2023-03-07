import java.util.Objects;
import java.util.LinkedList;

public class Pantry {
    private static LinkedList<Ingredient> ingredients = new LinkedList<Ingredient>(); //Set up empty ingredients list

    public static void add(String name, float quantity){ //Take a name and amount...
        Ingredient item = new Ingredient(name, quantity);//...make the name and amount into an ingredient object...
        ingredients.add(item); //...add ingredient object to the pantry ingredients list
    }

    public static float getQuantity(String name){ //Find out how much of an ingredient we have
        float quantity = 0; //Default to zero
        for(int i=0; i<ingredients.size(); i++){ //Go through each ingredient in the pantry
            if(Objects.equals(ingredients.get(i).name, name)){
                quantity = ingredients.get(i).amount; //If we have the ingredient, return how much we have
                break; //Don't bother going through the rest of the ingredients in the pantry
            }
        }
        return quantity;
    }
}
