import java.util.Scanner;
public class Task15{
  public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  int []a=new int[5];
  for(int i=0; i<a.length;i++){
    a[i]=scan.nextInt();
  }
  for(int i=1;i<a.length; i++){
    for(int j=0; j<a.length;j++){
    if(a[i]<a[j]){
      int temp=a[i];
      a[i]=a[j];
      a[j]=temp;
    }
    }
  }
  for(int i=0;i<a.length; i++){
    System.out.println(a[i]+" ");
  }
  
}
}
      
      