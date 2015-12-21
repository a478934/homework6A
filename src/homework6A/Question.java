package homework6A;

public class Question extends Component{
	   String description;
	   public Question(String desc) {
	      this.description = desc;
	   }
	   public void print() {
	      System.out.println(description);
	   }      
	}