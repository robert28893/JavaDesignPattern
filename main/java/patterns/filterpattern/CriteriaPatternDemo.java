package patterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hoang Phuong on 10/31/2016.
 */
public class CriteriaPatternDemo {
    public static void main(String args[]) {
        List<Person> personList = new ArrayList<Person>();

        personList.add(new Person("Robert", "Male", "Single"));
        personList.add(new Person("Alex", "Male", "Married"));
        personList.add(new Person("Julia", "Female", "Married"));
        personList.add(new Person("Jun", "Female", "Single"));
        personList.add(new Person("Bamboo", "Male", "Single"));
        personList.add(new Person("Lily", "Female", "Single"));

        Criteria singleCriteria = new CriteriaSingle();
        Criteria maleCriteria = new CriteriaMale();
        Criteria femaleCriteria = new CriteriaFemale();

        Criteria singleAndMaleCriteria = new AndCriteria(singleCriteria, maleCriteria);
        Criteria singleOrFemaleCriteria = new OrCriteria(singleCriteria, femaleCriteria);

        System.out.println("Males:");
        printPersons(maleCriteria.meetCriteria(personList));

        System.out.println("Females:");
        printPersons(femaleCriteria.meetCriteria(personList));

        System.out.println("Single:");
        printPersons(singleCriteria.meetCriteria(personList));

        System.out.println("Single & Males:");
        printPersons(singleAndMaleCriteria.meetCriteria(personList));

        System.out.println("Single or Females:");
        printPersons(singleOrFemaleCriteria.meetCriteria(personList));
    }

    private static void printPersons(List<Person> persons) {
        for(Person person : persons) {
            System.out.println("Person: [ Name: " + person.getName()
                    + ", Gender: " + person.getGender()
                    + ", Marital Status: " + person.getMaritalStatus()
                    + " ]");
        }
    }
}
