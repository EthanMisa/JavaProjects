import java.util.*;
public class TeenSum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a=scan.nextInt();
		System.out.println("Enter Second Number:");
		int b=scan.nextInt();
		if (a>=13&&a<=19||b>=13&&b<=19){
			System.out.println("19");
		}
		else{
			System.out.println(a+b);
		}
	}
}
