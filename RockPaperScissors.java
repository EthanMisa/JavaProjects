import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your throw: (r=rock, p=paper, s=scissors)");
		String answer=scan.next();
		scan.close();
		int  num=0;
		if (answer.equals("r")){
			System.out.println("USER PLAYED ROCK");
			num=1;
		}
		else if (answer.equals("p")){
			System.out.println("USER PLAYED PAPER");
			num=2;
		}
		else if (answer.equals("s")){
			System.out.println("USER PLAYED SCISSORS");
			num=3;
		}
		
		int ran=(int)((3-1+1)*Math.random()+1);
		
		if (ran==1){ //PC PICKS ROCK
			System.out.println("COMPUTER PLAYED ROCK");
			if (num==1){
				System.out.println("BOTH PLAYERS PLAYED ROCK. TIE");
			}
			else if (num==2){
				System.out.println("PAPER COVERS ROCK. PLAYER WINS");
			}
			else if (num==3){
				System.out.println("ROCK BREAKS SCISSORS. PC WINS");
			}
			else{}
		}
		else if (ran==2){ //PC PCIKS PAPER
			System.out.println("COMPUTER PLAYED PAPER");
			if (num==1){
				System.out.println("PAPER COVERS ROCK. PC WINS");
			}
			else if (num==2){
				System.out.println("BOTH PLAYERS PLAYED PAPER. TIE");
			}
			else if (num==3){
				System.out.println("SCISSORS CUT PAPER. PLAYER WINS");
			}
			else{}
		}
		else{ //PC PICKS SCISSORS
			System.out.println("COMPUTER PLAYED SCISSORS");
			if (num==1){
				System.out.println("ROCK BREAKS SCISSORS. PLAYER WINS");
			}
			else if (num==2){
				System.out.println("SCISSORS CUT PAPER. PC WINS");
			}
			else if (num==3){
				System.out.println("BOTH PLAYERS PLAYED SCISSORS. TIE");
			}
			else{}
		}
		
		
		
		

	}

}
