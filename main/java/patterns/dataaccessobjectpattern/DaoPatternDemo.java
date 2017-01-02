package patterns.dataaccessobjectpattern;

/**
 * Created by Hoang Phuong on 11/15/2016.
 */
public class DaoPatternDemo {
    public static void main(String args[]) {
        StudentDaoImpl studentDao = new StudentDaoImpl();

        for(Student student : studentDao.getAllStudents()) {
            System.out.println("Name: " + student.getName() + ", Roll No: " + student.getRollNo());
        }

        Student adam = new Student("Adam", 1);

        studentDao.updateStudent(adam);

        for(Student student : studentDao.getAllStudents()) {
            System.out.println("Name: " + student.getName() + ", Roll No: " + student.getRollNo());
        }
    }
}
