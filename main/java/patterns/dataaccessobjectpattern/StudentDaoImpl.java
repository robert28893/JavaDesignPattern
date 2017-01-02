package patterns.dataaccessobjectpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hoang Phuong on 11/15/2016.
 */
public class StudentDaoImpl implements StudentDao {
    private List<Student> students = new ArrayList<Student>();

    public StudentDaoImpl() {
        Student student1 = new Student("Robert", 0);
        Student student2 = new Student("Rooney", 1);

        students.add(student1);
        students.add(student2);

    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + " updated in the database");
    }

    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }
}
