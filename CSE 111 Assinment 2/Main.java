import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a= scan.nextInt();
    int sqr=2;
    int b =2;
    for(int i=2; i<=a; i+=2){
      int m= i*b;
      System.out.println(m);
      }
  }
}
     