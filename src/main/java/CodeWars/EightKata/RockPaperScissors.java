package CodeWars.EightKata;

/*Let's play! You have to return which player won! In case of a draw return Draw!.
Examples:
rps('scissors','paper') // Player 1 won!
rps('scissors','rock') // Player 2 won!
rps('paper','paper') // Draw!*/

public class RockPaperScissors {
    public static String RockPaperScissors(String p1, String p2){
        if (p1 == "scissors" && p2 =="paper"){
            return "Player 1 won!";
        }
        else if (p1 =="rock" && p2 == "scissors"){
            return "Player 1 won!";
        }
        else if(p1=="paper" && p2=="rock"){
            return "Player 1 won!";
        }
        else if (p1.equals(p2)) return "Draw!";
        else return "Player 2 won!";
    }
    public static void main(String[] args) {
        System.out.println("---------Test1---------");
        System.out.println(RockPaperScissors("rock", "scissors"));
        System.out.println(RockPaperScissors("scissors", "paper"));
        System.out.println(RockPaperScissors("paper", "rock"));

        System.out.println();
        System.out.println("---------Test2---------");
        System.out.println(RockPaperScissors("scissors", "rock"));
        System.out.println(RockPaperScissors("paper", "scissors"));
        System.out.println(RockPaperScissors("rock", "paper"));

        System.out.println();
        System.out.println("---------Test3---------");
        System.out.println(RockPaperScissors("scissors", "scissors"));
        System.out.println(RockPaperScissors("paper", "paper"));
        System.out.println(RockPaperScissors("rock", "rock"));
    }
}
