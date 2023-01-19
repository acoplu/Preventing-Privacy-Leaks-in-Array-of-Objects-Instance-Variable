public class Student {
    private int[] scores;

    public Student(Student original) { //Copy constructor to create deep copy of Student object
        int[] temp = new int[original.scores.length];

        for(int i=0; i<temp.length; i++)
            temp[i] = original.scores[i];

        this.scores = temp;
    }

    public int[] getScores() {
        int[]temp = new int[this.scores.length];

        for(int i=0; i<temp.length; i++)
            temp[i] = this.scores[i];

        return temp;
    }
}
