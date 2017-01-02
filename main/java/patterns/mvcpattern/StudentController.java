package patterns.mvcpattern;

/**
 * Created by Hoang Phuong on 11/12/2016.
 */
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name) {
        model.setName(name);
    }

    public void setRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
