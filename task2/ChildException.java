package task2;

public class ChildException extends ParentException{
	  public ChildException(Object o){
	    super(o);
	  }
	  public String toString() {
	    return "Child: "+ msg;
	  }  
	}