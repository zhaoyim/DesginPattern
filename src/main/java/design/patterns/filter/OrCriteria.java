package design.patterns.filter;

import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria current;
    private Criteria other;

    public OrCriteria(Criteria current, Criteria other) {
        this.current = current;
        this.other = other;
    }

    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> currentPersons = current.meetCriteria(persons);
        List<Person> otherPersons = other.meetCriteria(persons);
        currentPersons.removeAll(otherPersons);
        currentPersons.addAll(otherPersons);
        return currentPersons;
    }
}
