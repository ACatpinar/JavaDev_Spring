import Implementation.Mentor;
import Service.FullTimeMentor;
import Service.MentorAccount;

public class Application {

    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor = new FullTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTimeMentor) ;

        mentor.manageAccount();

    }
}