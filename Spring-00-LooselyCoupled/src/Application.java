import Implementation.Mentor;
import Service.FullTimeMentor;
import Service.MentorAccount;
import Service.PartTimeMentor;

public class Application {

    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor = new FullTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTimeMentor) ;

        mentor.manageAccount();

        PartTimeMentor partTimeMentor = new PartTimeMentor();

        MentorAccount mentor2 = new MentorAccount(partTimeMentor);
        partTimeMentor.createAccount();

        /*
        Loosely Coupling ==> an obj gets the obj to be used from external sources
        Reduces the dependencies of a class that uses the different classes directly
         */



        /*

         */

    }
}