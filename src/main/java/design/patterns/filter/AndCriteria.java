package design.patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria current;
    private Criteria other;

    public AndCriteria(Criteria current, Criteria other) {
        this.current = current;
        this.other = other;
    }


    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> andPersons = other.meetCriteria(current.meetCriteria(persons));

        return andPersons;
    }
}
