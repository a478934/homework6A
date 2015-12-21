package homework6A;

import java.util.ArrayList;

//繼承Component，並且新增一個建構子。
public class Exam extends Component{
	ArrayList<Component> examList;
	
	public Exam(){  //建構子內創出一個所有題目的陣列表。
		examList = new ArrayList<Component>();
	  }
	
	public void print() {  //印出考卷所有內容
		      int examSize=examList.size();     
		      for(int i=0;i<examSize;i++){
		    	  System.out.print(i+1+"、");
		    	  examList.get(i).print();
		      }	      
		   }   
	public void addQuestion(Component component) {	//加題目
		examList.add(component);
	}
	public void removeQuestion(Component Component) {	//移除題目
		examList.remove(Component);
	}
	public Component getQuestion(int i) {	//丟題號取得題目			
		return examList.get(i-1);
	}
	
}
