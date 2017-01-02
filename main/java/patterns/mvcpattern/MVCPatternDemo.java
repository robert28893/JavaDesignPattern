package patterns.mvcpattern;

/**
 * Created by Hoang Phuong on 11/13/2016.
 */
public class MVCPatternDemo {
    public static void main(String args[]) {
        Student student = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        student.setName("Rooney");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
