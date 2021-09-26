package ru.konstantinov.mapper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.konstantinov.jsongetter.JsonGetter;
import ru.konstantinov.person.Person;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

@Component
public class PersonMapperFromJson implements PersonMapper {

    @Autowired
    private JsonGetter jsonGetter;
    private final Type personListType = new TypeToken<List<Person>>(){}.getType();

    @Override
    public List<Person> map() {
        Gson g = new Gson();
        String json = null;
        try {
            json = jsonGetter.getJson();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return g.fromJson(json, personListType);
    }
}
