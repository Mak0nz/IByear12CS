package topicDlearningaids.Simon;

public class HighJumpSheet {
    /* ------------- Attributes ------------- */
    // static members
    final static String[] AGE_GROUPS = {"U12","U13","U14","U15",};

    Student[] participants; // students participating

    double[] heights; // heights of the high jump


    /* ------------- Constructor ------------- */
    

    /* ------------- Behaviour ------------- */
    public void storeResult(Student student, double height) {
        // perform a linear search to the student in the array and get its position index

        // replace the value of the corresponding index in heights

    }

    public void tallyResult() {
        // perform a bubble sort on the results (and at the same time the participants)
    }

    public Student calculateStudentWinner() {
        tallyResult();
        return participants[0];
    }

    public House calculateHouseWinner() {
        return null;
    }
}
