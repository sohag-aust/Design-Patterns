package Teacher;

public class Teacher {

    // double-checked-locking principal
    public static Teacher teacherObj;

    private Teacher() {

    }

    // locking ensures when the object is null, otherwise, locking is released, so when first thread creates the object, then the lock will release for other threads
    public static Teacher getTeacherInstance_Double_Locking() {
        if(teacherObj == null) {
            synchronized (Teacher.class) {
                if(teacherObj == null) {
                    teacherObj = new Teacher();
                }
            }
        }
        return teacherObj;
    }

    public void teach() {
        System.out.println("==** Teach can teach students **==");
    }
}
