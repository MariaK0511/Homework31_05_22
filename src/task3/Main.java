package task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Написать программу для проведения выборов.
        Избиратели должны предварительно зарегистрироваться в системе..
        Каждый участник голосует(пусть голос отдается рандомно одному из 3-5 значений).
        Данные о проголосовавших накапливаются в массиве либо списке Дважды проголосовать нельзя.
        По окончании периода голосования администратор запускает процедуру подсчета голосов и система выдает результат.
         */
        AllCandidates allCandidates = new AllCandidates();
        allCandidates.setCandidate(new Candidate("Victor"), 0);
        allCandidates.setCandidate(new Candidate("Vika"), 1);
        allCandidates.setCandidate(new Candidate("Mike"), 2);

        AllVoters allVoters = new AllVoters();
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter new user: ");
            String name = scanner.nextLine();
            System.out.println("Enter login: ");
            String login = scanner.nextLine();
            System.out.println("Enter password: ");
            String password = scanner.nextLine();
            Voter voter = new Voter(name, login, password);
            allVoters.setVoter(voter);
        }
        for (int index = 0; index < allVoters.voters.length; index++) {
            Voter voter = allVoters.voters[index];
            if (voter.voiced) {
                System.out.println("Voter has already voiced ");
                continue;
            }
            Random random = new Random();
            int num = random.nextInt(3);
            Candidate candidate = allCandidates.candidates[num];
            candidate.addVoice();
            voter.setVoiced();
        }
        for (int index = 0; index < allVoters.voters.length; index++) {
            Voter voter = allVoters.voters[index];
            if (voter.voiced) {
                System.out.println("Voter has already voiced " + voter.name);
                continue;
            }
            Random random = new Random();
            Candidate candidate = allCandidates.candidates[random.nextInt(3)];
            candidate.addVoice();
            voter.setVoiced();
        }
        System.out.println(Arrays.toString(allCandidates.candidates));
    }
}
