package HW4_28_6_2023_NOP.Manage_Student_5;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Enrollment {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private HashMap<String, ArrayList<Student>> dkHP= new HashMap<>();

    public Enrollment(){
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public Enrollment(ArrayList<Student> students, ArrayList<Course> courses) {
        this.students = students;
        this.courses = courses;
    }

    public ArrayList<Student> getAllStudent(){
        return students;
    }

    public Student getStudent(String mssv){
        Student oneStd = new Student();
        // boolean checkHaveMSSV = false;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getMssv() == mssv){
                String name = students.get(i).getNameStudent();
                String class_name = students.get(i).getClassStudent();
                String mssv_std = students.get(i).getMssv();
                String phone = students.get(i).getPhone();
                Student oneStd2 = new Student(name, class_name, mssv_std, phone);
                return oneStd2;
            }
        }
        return oneStd;
    }

    public ArrayList<Course> getAllCourse(){
        return courses;
    }

    public void getDKHP(){
        for (Map.Entry<String, ArrayList<Student>> entry : dkHP.entrySet()){
            String key = entry.getKey();
            ArrayList<Student> student = entry.getValue();
            System.out.println(key+" : "+student);
        }
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(String mssv){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getMssv() == mssv){
                students.remove(i);
                removeStudentAllHocPhan(mssv);
            }
        }
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void removeCourse(String nameCourse){
        for (int i = 0; i < courses.size(); i++) {
            if(courses.get(i).getCourseName() == nameCourse){
                courses.remove(i);
            }
        }
    }

    public void dangKyHocPhan(String course, Student student){
        // ArrayList<Student> newArrayStd = new ArrayList<>();
        if (!dkHP.containsKey(course)){
            ArrayList<Student> newArrayStd = new ArrayList<>();
            newArrayStd.add(student);
            dkHP.put(course, newArrayStd);
        }else{
            ArrayList<Student> newArrayStd = new ArrayList<>(dkHP.get(course));
            newArrayStd.add(student);
            dkHP.put(course, newArrayStd);
        }
        
        // dkHP.put(course, dkHP.get(course).add(student));
    }
    
    public void removeStudentFromHocPhan(String course, String mssv){
        if(dkHP.containsKey(course)){
            // for(Map.Entry<String, ArrayList<Student>> entry : dkHP.entrySet()){
            //     for (int i = 0; i < entry.getValue().size(); i++) {
            //         if(entry.getValue().get(i).getMssv() == mssv){

            //         }
            //     }
            // }
            dkHP.forEach((string, list) -> {
                list.removeIf(mssvStd -> mssvStd.getMssv() == mssv);
            });
        }
    }

    public void removeStudentAllHocPhan(String mssv){
        dkHP.forEach((string, list) -> {
            list.removeIf(mssvStd -> mssvStd.getMssv() == mssv);
        });
    }
    
}
