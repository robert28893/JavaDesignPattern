package patterns.transferobjectpattern;

/**
 * Created by Hoang Phuong on 11/27/2016.
 */
public class StudentVO {
    private String name;
    private Integer rollNo;

    public StudentVO(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }
}
