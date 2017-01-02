package patterns.visitorpattern;

/**
 * Created by Hoang Phuong on 11/10/2016.
 */
public class Keyboard implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
