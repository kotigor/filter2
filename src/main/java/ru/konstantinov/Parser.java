package ru.konstantinov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.konstantinov.mapper.PersonMapper;
import ru.konstantinov.person.Person;
import ru.konstantinov.person.filter.GuidPersonFilterByGenderAndAge;
import ru.konstantinov.person.filter.PersonFilter;

@Component
public class Parser {
    @Autowired
    PersonFilter personFilter;
    @Autowired
    PersonMapper personMapper;

    public void start(){
        System.out.println(personFilter.filter(personMapper.map()));
    }
}
