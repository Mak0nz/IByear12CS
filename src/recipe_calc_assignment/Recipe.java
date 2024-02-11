package recipe_calc_assignment;

public class Recipe {
    
    // ------ Data -----------------------------------------------
    int id;
    String name;
    String[] ingredients;
    double[] qty;
    int servings;
    String[] method;

    // ------ Actions --------------------------------------------
    public boolean containsIngredient(String search) {
        int index = 0;
        while (index < ingredients.length) {
            if (ingredients[index].equals(search)) {
                return true;
            }
            index = index + 1;
        }
        return false;
    }
    
    public boolean containsAnyIngredient(String[] search) {       
        // Declare an int variable for index
        int index = 0;

        // while index is less than search.length
        while (index < search.length) {
            if (containsIngredient(search[index])) { 
                return true;
            }
            // increment index by 1
            index++;

        }
        return false;
    }
    
    public void displayExcerpt() {
        // A nice display with the id, name, servings, and the first 3 ingredients 
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Servings: " + servings);
        System.out.print("Ingredients: ");
        // Display the top 3 ingredients
        int displayLimit = Math.min(3, ingredients.length);
        for (int i = 0; i < displayLimit; i++) {
            System.out.print(ingredients[i] + ", ");
        }

        // If there are more than 3 ingredients, indicate that there are additional ingredients
        if (ingredients.length > 3) {
            System.out.println(" ... and more.");
        } else {
            System.out.println();
        }
        System.out.println("------------------------------------------");
    }

    public void displayRecipe(boolean isMethodDisplay) {
        // Display the name
        System.out.println("Name: " + name);

        // Display the servings
        System.out.println("Servings: " + servings);

        // Display the ingredients list, with the qty
        System.out.println("Ingredients:  Quantity:");
        for (int i = 0; i < qty.length; i++) {
            System.out.println(ingredients[i] + ":  " + qty[i]);
        }

        if (isMethodDisplay) {
            // Display the method neatly using a for loop
            for (int i = 0; i < method.length; i++){
                System.out.println(method[i]);
            }
        }
    }

    public void adjustQtyForServings(int servings) {
        int i;

        // for every number in the qty[]
        for (i = 0; i < qty.length; i++) {
            // update qty[] by doing a calculation with servings
            qty[i] = qty[i] / Double.valueOf(this.servings);
            qty[i] = Double.valueOf(servings) * qty[i];
        }
    }
}