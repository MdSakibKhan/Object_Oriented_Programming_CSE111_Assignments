import java.util.Scanner;
public class Task2{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a[]= new int [10];
    for (int k=0; k<a.length; k++){
     System.out.println("Input numbers");
      a[k]=scan.nextInt();
    }
    System.out.println("Enter a index number");
    int i=scan.nextInt();
    if(i>=0 && i<=9){
      System.out.println(a[i]);
    }
  }
}