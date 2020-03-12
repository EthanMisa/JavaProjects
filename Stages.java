import java.util.Scanner;
public class Stages {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How old are you?");
		int age=scan.nextInt();
		if(age<=5){
			System.out.println("You must be a toddler");
		}
		else if (age<=10){
			System.out.println("You must be a child");
		}
		else if (age<=12){
			System.out.println("You must be a preteen");
		}
		else{
			System.out.println("You must be a teen");
		}
		scan.close();
	}	
	

}
