import java.util.Scanner;
public class Task6{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a[]= new int [10];
    for (int i=0; i<a.length; i++){
     System.out.println("Input numbers");
      a[i]=scan.nextInt();
    }
    for(int j=a.length-1; j>=0; j--){
      if(a[j]%2!=0){
       System.out.println(a[j]);
       break;
      }
    }
  }
}