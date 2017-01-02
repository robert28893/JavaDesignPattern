package patterns.filterpattern;

import java.util.List;

/**
 * Created by Hoang Phuong on 10/31/2016.
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Person> meetCriteria(List<Person> persons) {
        if((persons == null) || (criteria == null) || (otherCriteria == null)) {
            return null;
        }
        List<Person> firstList = criteria.meetCriteria(persons);
        List<Person> secondList = otherCriteria.meetCriteria(firstList);
        return secondList;
    }
}
