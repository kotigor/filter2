package ru.konstantinov.person.filter;

import ru.konstantinov.person.Person;

import java.util.List;

public interface PersonFilter {
    List<String> filter(List<Person> persons);
}
