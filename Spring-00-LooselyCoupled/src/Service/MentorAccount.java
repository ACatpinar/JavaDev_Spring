package Service;

import Implementation.Mentor;

public class MentorAccount {

    Mentor mentor; //composition

    public MentorAccount(Mentor mentor) {
        this.mentor = mentor;
    }

    public void manageAccount(){
        this.mentor.createAccount();
    }

}
