package design.patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> malePersons = new ArrayList<Person>();

        for (Person p : persons) {
            if (p.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(p);
            }
        }

        return malePersons;
    }
}
