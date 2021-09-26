package ru.konstantinov.person.filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import ru.konstantinov.person.Person;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GuidPersonFilterByGenderAndAge implements PersonFilter{
    @Value("${filter.minAge}")
    private int minAge;
    @Value("${filter.maxAge}")
    private int maxAge;
    @Value("${filter.gender}")
    private String gender;

    @Override
    public List<String> filter(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.gender.equals(gender))
                .filter(person -> person.age >= minAge)
                .filter(person -> person.age <= maxAge)
                .map(person -> person.guid)
                .collect(Collectors.toList());
    }
}
