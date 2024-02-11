package recipe_calc_assignment;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.stream.Stream;

import helpers.Keyboard;

public class RecipeCalcApp {

    /**
     * Declare global variables that can be used anywhere here. 
     */
    static Recipe[] recipes = new Recipe[20];

    public static void main(String[] args) {
        // we are calling this method first to load data
        // do not remove this
        init();

        int selection = 0;

        // declare a boolean variable for nextPage and set it to true
        boolean nextPage = true;

        // declare an int variable for page and set it to 1
        int page = 1;

        System.out.println("Welcome to RecipeCalcApp!");
        System.out.println("------------------------------------------");
        // while nextPage is true and selection is equal to 0
        while (nextPage && selection == 0) {
            // a for loop to display recipe excerpts between page - 1 and page + 4
            for (int i = (page-1)*4; i < page*4; i++) {
                Recipe recipe = recipes[i];
                recipe.displayExcerpt();
            }

            // if page is equal to 5 then nextPage is updated to false
            if (page == 5) {
                nextPage = false;
            } 

            // ask user to select recipe, or -1 for next page
            System.out.println("Select recipe by entering the matching ID, otherwise enter '0' for the next page");
            selection = Keyboard.readInt();

            if (selection > 0) {
                Recipe selectedRecipe = recipes[selection - 1];

                // Ask user to enter servings
                System.out.println("Please enter number of servings:");
                int servings = Keyboard.readInt();

                // Adjust servings for the selectedRecipe
                recipes[selection-1].adjustQtyForServings(servings);

                selectedRecipe.displayRecipe(false);
            } else if (selection == 0) {
                // update page variable
                page++;
            }
                        
        }
        
        // outside of while loop create a graceful exit for the user
        System.out.println("Thanks for using RecipeCalcApp, hope you enjoyed your stay!");
    }

    /**
     * This is a method that reads a file and creates Recipe instances
     * which are stored in the recipes array. Do not delete this code.
     */
    public static void init() {
        // make sure you have a text file
        File file = new File("src\\recipe_calc_assignment", "recipes.csv");
        if (file.exists()) {
            int lines;
            try (Stream<String> stream = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
                lines = (int) stream.count();
                stream.close();
                if (lines > 0) {
                    Scanner fileScan = new Scanner(file);
                    for (int i = 0; i < lines; i++) {
                        String[] nextLine = fileScan.nextLine().split(",");
                        recipes[i] = new Recipe();
                        recipes[i].id = Integer.parseInt(nextLine[0]);
                        recipes[i].name = nextLine[1];
                        recipes[i].ingredients = nextLine[2].replaceAll("[\\[\\]]", "").split(";");
                        String[] qty = nextLine[3].replaceAll("[\\[\\]]", "").split(";");
                        recipes[i].qty = new double[qty.length];
                        for (int j = 0; j < qty.length; j++) {
                            recipes[i].qty[j] = Double.parseDouble(qty[j]);
                        }
                        recipes[i].servings = Integer.parseInt(nextLine[4]);
                        recipes[i].method = nextLine[5].replaceAll("[\\[\\]]", "").split(";");
                    }
                    fileScan.close();
                }
            } catch (IOException e) {
                System.out.println("Err: Did not manage to load data.");
            }
        }
    }
}