import java.util.Scanner;
public class Task12{
  public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  int []a=new int[5];
  for(int i=0; i<a.length;i++){
    a[i]=scan.nextInt();
  }
  int largest=0;
  for(int i=0; i<a.length; i++){
    if(a[i]>largest){
      largest=a[i];
    }
  }
  System.out.println(largest);
  }
}
  