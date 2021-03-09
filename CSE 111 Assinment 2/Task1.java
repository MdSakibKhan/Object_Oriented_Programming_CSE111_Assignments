import java.util.Scanner;
public class Task1{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a[]= new int [3];
    for (int i=0; i<a.length; i++){
      a[i]=scan.nextInt();
    }
    int temp=0;
    for(int j=0; j<a.length; j++){
      int sum = temp + a[j];
      temp=sum;
    }
    System.out.print(temp+"  ");
    for (int i=0; i<a.length; i++){
     System.out.print(a[i]+" ");
  }
     scan.close();
 }
}
  
  