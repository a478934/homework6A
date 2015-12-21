package homework6A;

import java.util.ArrayList;

public class Exam extends Component{
	ArrayList<Component> examList;
	
	public Exam(){
		examList = new ArrayList<Component>();
	  }
	
	public void print() {
		      int examSize=examList.size();     
		      for(int i=0;i<examSize;i++){
			      System.out.println(examList.get(i));
		      }	      
		   }   
	public void addQuestion(Component component) {	
		examList.add(component);
	}
	public void removeQuestion(int index) {	
		examList.remove(index);
	}	

}
