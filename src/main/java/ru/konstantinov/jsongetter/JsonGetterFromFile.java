package ru.konstantinov.jsongetter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class JsonGetterFromFile implements JsonGetter{
    @Value("${jsonGetter.path}")
    private String path;

    @Override
    public String getJson() throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
}
