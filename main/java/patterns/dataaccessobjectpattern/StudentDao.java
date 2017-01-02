package patterns.dataaccessobjectpattern;

import java.util.List;

/**
 * Created by Hoang Phuong on 11/15/2016.
 */
public interface StudentDao {
    List<Student> getAllStudents();
    void updateStudent(Student student);
    void deleteStudent(Student student);
    void addStudent(Student student);
    Student getStudent(int rollNo);
}
