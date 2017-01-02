package patterns.transferobjectpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hoang Phuong on 11/27/2016.
 */
public class StudentBO {
    private List<StudentVO> students;

    public StudentBO() {
        students = new ArrayList<StudentVO>();
        StudentVO student1 = new StudentVO("robert", 0);
        StudentVO student2 = new StudentVO("rooney", 1);
        students.add(student1);
        students.add(student2);
    }

    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(Integer rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student) {
        if(students.get(student.getRollNo()) != null) {
            students.get(student.getRollNo()).setName(student.getName());
            System.out.println("Update student at rollNo " + student.getRollNo());
        }
    }

    public void deleteStudent(StudentVO student) {
        System.out.println("Deleted student at rollNo " + student.getRollNo());
        students.remove(student.getRollNo());
    }

    public void addStudent(StudentVO student) {
        students.add(student);
    }
}
