package task3;

public class AllVoters {
    Voter[] voters = new Voter[5];

    public void setVoter(Voter voter) {
        for (int index = 0; index < voters.length; index++) {
            if (voters[index] == null) {
                voters[index] = voter;
                break;
            }
            if (voters.length == index + 1) {
                System.out.println("Voter's limit is over");
            }
        }
    }
}
