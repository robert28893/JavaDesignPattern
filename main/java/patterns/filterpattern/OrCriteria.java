package patterns.filterpattern;

import java.util.List;

/**
 * Created by Hoang Phuong on 10/31/2016.
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Person> meetCriteria(List<Person> persons) {
        if((persons == null) || (criteria == null) || (otherCriteria == null)) {
            return null;
        }
        List<Person> firstList = criteria.meetCriteria(persons);
        List<Person> secondList = criteria.meetCriteria(persons);

        for(Person person : secondList) {
            if(!firstList.contains(person)) {
                firstList.add(person);
            }
        }
        return firstList;
    }
}
