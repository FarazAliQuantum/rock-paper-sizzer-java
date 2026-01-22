import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int num = rand.nextInt(3);
        String[] choices = {"rock", "paper", "scissor"};
        String computerChoices = choices[num];
        String userChoices = sc.next().toLowerCase();

        System.out.println("Computer chose: " + computerChoices);

        if (userChoices.equals(computerChoices)) {
            System.out.println("Draw");
        }
        else if (
            (userChoices.equals("rock") && computerChoices.equals("scissor")) ||
            (userChoices.equals("scissor") && computerChoices.equals("paper")) ||
            (userChoices.equals("paper") && computerChoices.equals("rock"))
        ) {
            System.out.println("User wins");
        }
        else {
            System.out.println("Computer wins");
        }

        sc.close();
    }
}
