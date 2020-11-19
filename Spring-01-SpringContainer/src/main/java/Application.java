import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;
import services.PartTimeMentor;

public class Application {

    public static void main(String[] args) {

        //BeanFactory container = new ClassPathXmlApplicationContext("config.xml");  implements AppContext
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

       // Mentor mentor = new FullTimeMentor(); //new keyword creates dependencies

        Mentor mentor = (Mentor) container.getBean("FullTimeMentor");
        mentor.createAccount();

        //Mentor mentor1 = new PartTimeMentor();
        Mentor mentor1 = (Mentor) container.getBean("PartTimeMentor");
        mentor1.createAccount();

        Mentor mentor2 = container.getBean("MIMentor", Mentor.class); // same with downcasting
        mentor2.createAccount();








    }
}
