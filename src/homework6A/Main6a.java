package homework6A;

public class Main6a {

	public static void main(String arg[]){
		Exam exam1=new Exam(),exam2=new Exam();
		
		exam1.addQuestion(new Question("�j�H��l�ܪ���?"));
		exam1.addQuestion(new Question("�ߤW��ı���A�l�ܷж�?"));
		
		exam2.addQuestion(exam1.getQuestion(1));
		exam2.addQuestion(new Question("�e�W�D�A���n����O?"));
 	  
		System.out.println("�Ҩ�1:");
		exam1.print();
		
		System.out.println("�Ҩ�2:");
		exam2.print();
		
	}
}
