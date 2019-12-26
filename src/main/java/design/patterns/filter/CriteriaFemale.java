package design.patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person p : persons) {
            if (p.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(p);
            }
        }
        return femalePersons;
    }
}
