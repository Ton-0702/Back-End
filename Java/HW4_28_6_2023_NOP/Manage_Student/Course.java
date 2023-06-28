package HW4_28_6_2023_NOP.Manage_Student;

public class Course extends Enrollment{
    private String courseName;
    private String courseDateCreate;

    public Course(){
        this.courseName = null;
        this.courseDateCreate = null;
    }

    public Course(String courseName, String courseDateCreate) {
        this.courseName = courseName;
        this.courseDateCreate = courseDateCreate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDateCreate() {
        return courseDateCreate;
    }

    public void setCourseDateCreate(String courseDateCreate) {
        this.courseDateCreate = courseDateCreate;
    }

    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", courseDateCreate=" + courseDateCreate + "]";
    }

}
