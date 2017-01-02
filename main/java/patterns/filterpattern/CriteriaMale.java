package patterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hoang Phuong on 10/31/2016.
 */
public class CriteriaMale implements Criteria {
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> maleList = new ArrayList<Person>();
        for(Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")) {
                maleList.add(person);
            }
        }
        return maleList;
    }
}
