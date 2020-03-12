import java.util.Scanner;
public class SurfsUp2{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int waveHeight;
		System.out.println("How high are the waves?");
		waveHeight=scan.nextInt();
		if(waveHeight>=6){
			System.out.println("Go surfing");
		}
		else{
			System.out.println("Go body surfing");
		}
		scan.close();
	
	}
}