import java.util.Scanner;
public class Task17{
  public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  int n=scan.nextInt();
  int []a=new int[n];
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
  if(n%2==0){
    System.out.println((a[n/2-1]+a[n/2])/2.0);
  }
  else if(n%2!=0){
    System.out.println(a[n/2]);
  }
  }
}