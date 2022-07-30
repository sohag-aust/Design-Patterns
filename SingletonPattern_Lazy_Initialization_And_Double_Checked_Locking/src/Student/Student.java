package Student;

public class Student {

    // lazy-initialization
    private static Student studentObj;

    private Student() {

    }

    // lazy-loading
    public static Student getStudentInstance() {
        if(studentObj == null) {
            studentObj = new Student();
        }
        return studentObj;
    }

    // it works, when 2 or more thread wants the instance of student object, then first thread comes first and create instance. after completing first thread works, then second thread enters.
    // drawbacks: if there is a case that, if first thread enters, then it will block the 2nd thread for doing 2nd thread's work. so waiting increases for 2nd thread, that's why double-checked locking comes into the picture
    public static synchronized Student getStudentInstance_ThreadSafe() {
        if(studentObj == null) {
            studentObj = new Student();
        }
        return studentObj;
    }

    public void read() {
        System.out.println("==** Student is reading **==");
    }
}
