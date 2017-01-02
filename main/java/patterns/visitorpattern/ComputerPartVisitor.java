package patterns.visitorpattern;

/**
 * Created by Hoang Phuong on 11/10/2016.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
