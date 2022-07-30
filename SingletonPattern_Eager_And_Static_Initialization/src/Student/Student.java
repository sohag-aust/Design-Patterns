package Student;

public class Student {

    // Implementing Eager initialization
    // Problem of Eager initialization: Object is created at the time of class loading, whether that object is needed or not

    public static final Student STUDENT_OBJ = new Student();

    private Student() {

    }

    public static Student getStudentInstance() {
        return STUDENT_OBJ;
    }

    public void read() {
        System.out.println("==** Student is Reading **==");
    }
}
