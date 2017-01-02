package patterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hoang Phuong on 10/31/2016.
 */
public class CriteriaSingle implements Criteria {
    public List<Person> meetCriteria(List<Person> persons) {
        if(persons == null) {
            return null;
        }
        List<Person> singleList = new ArrayList<Person>();
        for(Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singleList.add(person);
            }
        }
        return singleList;
    }
}
