package patterns.visitorpattern;

/**
 * Created by Hoang Phuong on 11/10/2016.
 */
public class Monitor implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
