package patterns.visitorpattern;

/**
 * Created by Hoang Phuong on 11/10/2016.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
