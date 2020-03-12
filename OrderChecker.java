import java.util.Scanner;
class OrderChecker{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    int bolts, nuts, washers, cost;
    System.out.println("How many bolts do you have?");
    bolts=scan.nextInt();
    System.out.println("How many nuts do you have?");
    nuts=scan.nextInt();
    System.out.println("How many washers do you have?");
    washers=scan.nextInt();
    cost=(bolts*5)+(nuts*3)+(washers);
    System.out.println("Your total is " + cost + " cents.");
    scan.close();
  }
}