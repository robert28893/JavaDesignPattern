package patterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hoang Phuong on 10/31/2016.
 */
public class CriteriaFemale implements Criteria {
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femaleList = new ArrayList<Person>();
        for(Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")) {
                femaleList.add(person);
            }
        }
        return femaleList;
    }
}
