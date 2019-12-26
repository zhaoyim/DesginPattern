package design.patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePerson = new ArrayList<Person>();
        for (Person p : persons) {
            if (p.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePerson.add(p);
            }
        }
        return singlePerson;
    }
}
