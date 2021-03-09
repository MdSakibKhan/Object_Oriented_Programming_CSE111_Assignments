import java.util.Scanner;
public class Task10{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a[]= new int [10];
    for (int i=0; i<a.length; i++){
      a[i]=scan.nextInt();
      for(int k=0; k<=i; k++){
      System.out.print(a[k]+" ");
      }
    }
  }
}