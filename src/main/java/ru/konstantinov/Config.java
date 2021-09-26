package ru.konstantinov;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("ru")
@PropertySource("varConfig.properties")
public class Config {

}
