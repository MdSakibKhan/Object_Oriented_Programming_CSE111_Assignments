import java.util.Scanner;
public class Task14{
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
  int small=a[0];
  for(int i=1; i<a.length; i++){
    if(a[i]<small){
      small=a[i];
    }
  }
    
  for(int i=0; i<a.length; i++){
    if(largest==a[i]){
      System.out.println("largest number is "+largest+ " which is located in array no "+ i );
    }
  }
  for(int i=0; i<a.length; i++){
    if(small==a[i]){
      System.out.println("Smallest number is "+small+" which is located in array no "+ i);
  }
}
  }
}
  
