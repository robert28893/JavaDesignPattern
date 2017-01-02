package patterns.visitorpattern;

/**
 * Created by Hoang Phuong on 11/11/2016.
 */
public class VisitorPatternDemo {
    public static void main(String args[]) {
        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();

        ComputerPart computer = new Computer();
        computer.accept(visitor);
    }

}
