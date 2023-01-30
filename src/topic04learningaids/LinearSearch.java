package topic04learningaids;

/**
 * 4.2.1 Describe the characteristics of standard 1D array algorithms
 * 4.3.11 Construct algorithms that use arrays and access methods
 */
public class LinearSearch {
    
    /**
     * 
     * @param numarr
     * @param target
     * @return
     */
    public static int search(int[] numarr, int target) {
        // implement the following pseudocode
        // loop for index from 0 to numarr.length
        //    if target is equal to numarr[index] then
        //       return index
        //    end if
        // end loop
        for (int i = 0; i < numarr.length; i++) {
            if (numarr[i] == target) {
                return i;
            }
        }
        return -1; // not found because -1 is not an index that exists
    }

    public static int search(String[] strarr, String target) {
        return -1;
    }
}