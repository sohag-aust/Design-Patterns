import Student.Student;
import Teacher.Teacher;

public class Main {
    public static void main(String[] args) {

        // lazy initialization
        Student student_LazyInstance = Student.getStudentInstance();
        student_LazyInstance.read();


        // thread-safe lazy initialization
        Student student_LazyInstance_ThreadSafe = Student.getStudentInstance_ThreadSafe();
        student_LazyInstance_ThreadSafe.read();


        // double-checked-locking principal
        Teacher teacher = Teacher.getTeacherInstance_Double_Locking();
        teacher.teach();
    }
}