import java.util.Scanner;
public class RockPaperScissorsScore {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the play");
		String play=scan.nextLine();
		if(play.equals("rock scissors")||play.equals("paper rock")||play.equals("scissors paper")){
			System.out.println("Devon wins");
		}
		else if(play.equals("rock paper")||play.equals("scissors rock")||play.equals("paper scissors")){
			System.out.println("Myles wins");
		}
		else if(play.equals("rock rock")||play.equals("scissors scissors")||play.equals("paper paper")){
			System.out.println("Tie");
		}
		else{
			System.out.println("Invalid play");
		}
	}

}
