package homework6A;

public class Main6a {

	public static void main(String arg[]){
		Exam exam1=new Exam(),exam2=new Exam();
		
		exam1.addQuestion(new Question("大象鼻子很長嗎?"));
		exam1.addQuestion(new Question("晚上睡覺有蚊子很煩嗎?"));
		
		exam2.addQuestion(exam1.getQuestion(1));
		exam2.addQuestion(new Question("呈上題，那要怎麼辦呢?"));
 	  
		System.out.println("考卷1:");
		exam1.print();
		
		System.out.println("考卷2:");
		exam2.print();
		
	}
}
