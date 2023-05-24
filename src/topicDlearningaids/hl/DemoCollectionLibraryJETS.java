package topicDlearningaids.hl;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Link to D.4.11
 * 
 */
public class DemoCollectionLibraryJETS {
    
    static ArrayList<Animal> testMyAnimalCollection;

    static int totalTests = 0;
    
    public static void main(String[] args) {
        testSetup();
        testIsEmptyTrue();
        testLinearSearchEmptyList();
        // todo: more tests
        testTearDown(); 
    }

    private static void testSetup() {
        System.out.println("*** Welcome to our suite of tests for Animal Collection ***");
    }

    private static void testTearDown() {

    }

    public static void testIsEmptyTrue() {
        // When I create an Animal Collection
        ArrayList<Animal> emptyAnimalCol = new ArrayList<Animal>();
        // But not add anything to the collection
        // Then isEmpty should give me True
        if (emptyAnimalCol.isEmpty()) {
            System.out.print("P. "); // and the test passes
        } else {
            System.out.print("F. "); // and the test fails
        }
        totalTests++;
    }

    // todo: testIsEmptyFalse()
    public static void testIsEmptyFalse() {
        // When I create an Animal Collection

        // But add in Animal object "Persian Cat" as the head

        // Then isEmpty should give me False
    }

    public static void testLinearSearchEmptyList() {
        // Given I have an empty linked list
        ArrayList<Animal> myEmptyAnimalCol = new ArrayList<Animal>();
        
        // Given I have an animal
        Animal targetAnimal = new Animal("Persian Cat", "Egypt", null, null, false);

        // And that animal is not in the list
       
        // When I search for my animal...
        boolean isFound = false;
        {
            // reset to the head
            Iterator<Animal> iterator = myEmptyAnimalCol.iterator();
            
            // looping through my collection
            while (iterator.hasNext()) {
                Animal nextAnimal = iterator.next();
                if (nextAnimal.name == targetAnimal.name) {
                    System.out.println("I have found my animal!");
                    isFound = true;
                }
            }
        }

        // Then I should not find it
        if (!isFound) {
            System.out.print("P. ");
        } else {
            System.out.print("F. ");
        }
        
        totalTests++;
    }
}