import java.util.Scanner;
class SurfsUp{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("How big are the waves?");
    scan.close();
    int heightWave=scan.nextInt();
    if(heightWave>=6){
      System.out.println("Great day for surfing!");
    }
    else{
      System.out.println("Very bad day for surfing :(");
    }
     
    
      
  }
}