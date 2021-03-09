package task1;

public class WrongCourseException extends Exception{
    String k=" "; 
 WrongCourseException(String a) {
       k=a;
       }
 public String toString() {
  return k;
  
 }
}
