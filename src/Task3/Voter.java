package Task3;

import Task1.Vector;

import java.util.Random;

public class Voter {
    String name;
    String login;
    String password;
    boolean voiced = false;

    public Voter(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", voice=" + voiced +
                '}';
    }

    public void setVoiced() {
        if (voiced) {
            System.out.println("Error! Only one time you can voice");
        } else
         voiced = true;
    }
}
