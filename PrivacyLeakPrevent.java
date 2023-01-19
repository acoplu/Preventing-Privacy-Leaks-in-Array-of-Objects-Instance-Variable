public class PrivacyLeakPrevent {
    private Student[] studentList;

    public PrivacyLeakPrevent(Student[] arr) {
        Student[] temp = new Student[arr.length];

        for(int i=0; i<temp.length; i++)
            temp[i] = new Student(arr[i]);

        this.studentList = temp;
    }

    public Student[] getStudentList() {
        Student[] temp = new Student[this.studentList.length];

        for(int i=0; i<temp.length; i++)
            temp[i] = new Student(this.studentList[i]);

        return temp;
    }
}
