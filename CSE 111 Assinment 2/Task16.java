import java.util.Scanner;
public class Task16{
  public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  int []a=new int[10];
  for(int i=0; i<a.length;i++){
    a[i]=scan.nextInt();
  }
  for(int i=a.length-1; i>=0; i--){
    for(int j=a.length-1;j>=0;j--){
    if(a[i]<a[j]){
      int temp=a[i];
      a[i]=a[j];
      a[j]=temp;
     }
    }
  }
  for(int i=0; i<a.length;i++){
    System.out.print(a[i]+" ");
  }
}
}