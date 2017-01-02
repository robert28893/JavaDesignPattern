package patterns.transferobjectpattern;

/**
 * Created by Hoang Phuong on 11/27/2016.
 */
public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();
        StudentVO student = new StudentVO("falcao", 1);
        studentBO.updateStudent(student);
        StudentVO falcao = studentBO.getStudent(1);

        System.out.println("Name after updated is " + falcao.getName());
    }
}
