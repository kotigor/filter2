import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.konstantinov.Config;
import ru.konstantinov.Parser;
import ru.konstantinov.mapper.PersonMapper;
import ru.konstantinov.person.filter.PersonFilter;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Parser parser = context.getBean(Parser.class);
        parser.start();
        context.close();
    }
}
