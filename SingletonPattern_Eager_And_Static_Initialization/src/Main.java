import Student.Student;
import Teacher.Teacher;

public class Main {
    public static void main(String[] args) {

        // Eager initialization
        Student student = Student.getStudentInstance();
        student.read();

        // Static-Block initialization
        Teacher teacher = Teacher.getTeacherInstance();
        teacher.teach();
    }
}