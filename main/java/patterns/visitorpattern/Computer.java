package patterns.visitorpattern;

/**
 * Created by Hoang Phuong on 11/10/2016.
 */
public class Computer implements ComputerPart {
    ComputerPart parts[];

    public Computer() {
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
