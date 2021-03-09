package task3;

public class ParentException extends Exception{
	  protected String msg;
	  public ParentException(Object o){
	    msg = o.toString();
	  }
	  public String toString() {
	    return "Parent: "+ msg; 
	  }
	}
