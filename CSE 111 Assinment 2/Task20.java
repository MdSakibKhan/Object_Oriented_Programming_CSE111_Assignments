import java.util.Scanner;
public class Task20{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String a[]= new String [10];
    for (int i=0; i<a.length; i++){
     System.out.println("Input number string");
      a[i]=scan.nextLine();
    }
       int n=scan.nextInt();
       if(n<a.length){
         System.out.println(a[n]);
      }
    }
  }
