import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int playerPoints = 0;
        int comPoints = 0;
        String[] choices = {"rock", "paper", "scissors"};
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!\n");

        do {
            System.out.println("Enter your next move:");
            String turn = input.nextLine();
            String comTurn = choices[(int) (Math.random() * 3)];
            if (!turn.equalsIgnoreCase("rock") && !turn.equalsIgnoreCase("paper") && !turn.equalsIgnoreCase("scissors")){
                System.out.println("Invalid input, please try again");
                continue;
            }
            System.out.println("You chose: " + turn + "\nComputer chose: " + comTurn);
            if (turn.equalsIgnoreCase(comTurn)){
                System.out.println("You tied! No Points");
            }else if (turn.equalsIgnoreCase("rock") && comTurn.equalsIgnoreCase("scissors")){
                playerPoints += 1;
                System.out.println("You got a point!\n");
            }else if(turn.equalsIgnoreCase("paper") && comTurn.equalsIgnoreCase("rock")){
                playerPoints += 1;
                System.out.println("You got a point!\n");
            }else if (turn.equalsIgnoreCase("scissors") && comTurn.equalsIgnoreCase("paper")){
                playerPoints += 1;
                System.out.println("You got a point!\n");
            }else {
                comPoints += 1;
                System.out.println("Computer got a point :(\n");
            }
        }while (playerPoints < 2 && comPoints < 2);

        if (playerPoints == 2) System.out.println("Congrats! You won!");
        else System.out.println("Computer won :(");

    }
}
