package patterns.filterpattern;

import java.util.List;

/**
 * Created by Hoang Phuong on 10/31/2016.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
