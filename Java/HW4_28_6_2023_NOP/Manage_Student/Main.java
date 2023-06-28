package HW4_28_6_2023_NOP.Manage_Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Enrollment enrollment = new Enrollment();
        Student st1 = new Student("Tu", "DHKHDL15A", "1912412", "1231232");
        Student st2 = new Student("Hieu", "DHKHMT15B", "19124232", "1412232");
        Student st3 = new Student("Toan", "DHKHMT15A", "19447201", "14122322");
        enrollment.addStudent(st1);
        enrollment.addStudent(st2);
        enrollment.addStudent(st3);

        Course crs1 = new Course("Deep Learning", "21/02/2005");
        Course crs2 = new Course("Machine Learning", "18/03/2005");
        Course crs3 = new Course("Computer Vision", "16/02/2005");
        enrollment.addCourse(crs1);
        enrollment.addCourse(crs2);
        enrollment.addCourse(crs3);

        ArrayList<Student> showAllStd = enrollment.getAllStudent();
        ArrayList<Course> showAllcourse = enrollment.getAllCourse();
        System.out.println();
        System.out.println();
        System.out.println("=========Danh sach cac hoc sinh: ");
        System.out.println(showAllStd);

        System.out.println();
        System.out.println();
        System.out.println("=========Danh sach khoa hoc: ");
        System.out.println(showAllcourse);

        System.out.println();
        System.out.println();
        System.out.println("=========Danh sach hoc sinh sau khi xoa hoc sinh theo mssv: ");
        enrollment.removeStudent("1912412");
        System.out.println(showAllStd);

        System.out.println();
        System.out.println();
        System.out.println("=========Danh sach khoa hoc sau khi xoa: ");
        enrollment.removeCourse("Deep Learning");
        System.out.println(showAllcourse);

        System.out.println();
        System.out.println();
        System.out.println("=========Dang ky hoc phan: ");
        Student std_Sign = enrollment.getStudent("19447201");
        Student std_Sign2 = enrollment.getStudent("19124232");
        enrollment.dangKyHocPhan("Machine Learning", std_Sign);
        enrollment.dangKyHocPhan("Machine Learning", std_Sign2);
        enrollment.dangKyHocPhan("Computer Vision", std_Sign2);
        enrollment.dangKyHocPhan("Computer Vision", std_Sign);
        enrollment.getDKHP();

        System.out.println();
        System.out.println();
        System.out.println("=========Xoa hoc sinh ra khoi hoc phan: ");
        // ArrayList<Student> std_Sign = enrollment.getStudent("19447201");
        // enrollment.dangKyHocPhan("Machine Learning", std_Sign);
        enrollment.removeStudentFromHocPhan("Machine Learning", "19447201");
        enrollment.getDKHP();

        System.out.println();
        System.out.println();
        System.out.println("=========Xoa hoc sinh ra khoi hoc phan khi xoa hoc sinh ra khoi quan ly student: ");
        enrollment.removeStudent("19124232");
        enrollment.getDKHP();
    }
}
