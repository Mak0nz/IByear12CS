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
            index += 1;

        }
        return false;
    }
    
    public void displayExcerpt() {
        // TODO: A nice display with the id, name, servings, and the first 3 ingredients 
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Servings: " + servings);
        System.out.print("Ingredients: ");
        // Display the top 3 ingredients
        int displayLimit = Math.min(3, ingredients.length);
        for (int i = 0; i < displayLimit; i++) {
            System.out.printf("| %-40s |\n", ingredients[i]);
        }

        // If there are more than 3 ingredients, indicate that there are additional ingredients
        if (ingredients.length > 3) {
            System.out.println("| ... and more                               |");
        }
        
    }

    public void displayRecipe(boolean isMethodDisplay) {
        // TODO: Display the name

        // TODO: Display the servings

        // TODO: Display the ingredients list, with the qty

        if (isMethodDisplay) {
            // TODO: Display the method neatly using a for loop
        }
    }

    public void adjustQtyForServings(int servings) {
        // TODO: for every number in the qty[]

        //      TODO: update qty[] by doing a calculation with servings        
    }
}