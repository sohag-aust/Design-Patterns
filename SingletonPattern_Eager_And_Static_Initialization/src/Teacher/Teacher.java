package Teacher;

public class Teacher {

    // Implementing Static-Block initialization
    // Problem of Static-Block initialization: Object is created at the time of class loading, whether that object is needed or not

    public static Teacher teacherObj;

    private Teacher() {

    }

    // sometimes we need to handle exception on the time of creating object, so we can achieve it in static block initialization
    static {
        try {
            teacherObj = new Teacher();
        } catch (RuntimeException runtimeException) {
            throw new RuntimeException("Exception occurred in the time of creating object");
        }
    }

    public static Teacher getTeacherInstance() {
        return teacherObj;
    }

    public void teach() {
        System.out.println("==** Teacher can teach students **==");
    }
}
