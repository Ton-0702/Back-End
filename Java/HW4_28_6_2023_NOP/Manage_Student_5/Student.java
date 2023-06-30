package HW4_28_6_2023_NOP.Manage_Student_5;

public class Student {
    private String nameStudent;
    private String classStudent;
    private String mssv;
    private String phone;

    public Student(){
        this.nameStudent = null;
        this.classStudent = null;
        this.mssv = null;
        this.phone = null;
    }

    public Student(String nameStudent, String classStudent, String mssv, String phone) {
        this.nameStudent = nameStudent;
        this.classStudent = classStudent;
        this.mssv = mssv;
        this.phone = phone;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student [nameStudent=" + nameStudent + ", classStudent=" + classStudent + ", mssv=" + mssv + ", phone="
                + phone + "]";
    }
    
}
