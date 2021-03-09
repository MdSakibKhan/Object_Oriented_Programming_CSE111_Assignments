package task2;
public class BadThing{
	  private String msg = null;
	  private int num;
	  public BadThing (int i){
	    num = i;
	  }
	  public void badMethod() throws Exception{
	    if (num < 11){
	      throw new ArrayIndexOutOfBoundsException ();
	    }
	    if (num%4 == 0){
	      throw new ParentException(new BadThing(num));
	    }else{
	      throw new ChildException(new BadThing(num));
	    }
	  }
	  public String toString(){
	    if (num%4 == 0){
	      return "You are an divisible "+ num;
	    }else{
	      return "You are an not divisible "+ num;
	    }
	  }
}
