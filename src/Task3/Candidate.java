package Task3;

import java.util.Random;

public class Candidate {
    private String name;
    private int voice = 0;

    public Candidate(String name) {
        this.name = name;
    }

    public void addVoice() {
        voice++;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", voice=" + voice +
                '}';
    }
}
