public class Application {

    public static void main(String[] args) {
        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor partTime = new PartTimeMentor();

        Mentor mentor = new Mentor(fullTime,partTime);
        mentor.manageAccount();
        /*
        mentor object has dependency to the part and full time objects
        when we want to add new Mentor, we need to add lots of mentor obj to the other classes too.
        using tightlyCoupled is not useful.
        Coupling means usage of an object by different object,
        basically means an object needs another obj to complete assigned task
         */
    }
}
