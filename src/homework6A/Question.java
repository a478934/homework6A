package homework6A;

public class Question extends Component{  
	//繼承Component，並且新增一個建構子，傳一個題目內容。
	   String description;
	   public Question(String desc) {
	      this.description = desc;
	   }
	   public void print() {  //印出題目
	      System.out.println(description);
	   }      
	}