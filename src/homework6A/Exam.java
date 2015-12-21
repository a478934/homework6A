package homework6A;

import java.util.ArrayList;

//�~��Component�A�åB�s�W�@�ӫغc�l�C
public class Exam extends Component{
	ArrayList<Component> examList;
	
	public Exam(){  //�غc�l���ХX�@�өҦ��D�ت��}�C��C
		examList = new ArrayList<Component>();
	  }
	
	public void print() {  //�L�X�Ҩ��Ҧ����e
		      int examSize=examList.size();     
		      for(int i=0;i<examSize;i++){
		    	  System.out.print(i+1+"�B");
		    	  examList.get(i).print();
		      }	      
		   }   
	public void addQuestion(Component component) {	//�[�D��
		examList.add(component);
	}
	public void removeQuestion(Component Component) {	//�����D��
		examList.remove(Component);
	}
	public Component getQuestion(int i) {	//���D�����o�D��			
		return examList.get(i-1);
	}
	
}
