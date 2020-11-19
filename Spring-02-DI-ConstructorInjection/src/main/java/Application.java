import com.Interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = container.getBean("Java",Course.class);

        course1.getTeachingHours();

        Course course2 = container.getBean("Selenium",Course.class);

        course2.getTeachingHours();
    }
}
