package homework6A;

public class Main6a {

	public static void main(String arg[]){
		Exam exam1=new Exam(),exam2=new Exam();
		
		//創出考試1
		exam1.addQuestion(new Question("大象鼻子很長嗎?"));
		exam1.addQuestion(new Question("晚上睡覺有蚊子很煩嗎?"));
		//創出考試2
		exam2.addQuestion(exam1.getQuestion(2));
		exam2.addQuestion(new Question("呈上題，那要怎麼辦呢?"));
		exam2.addQuestion(new Question("此題送分"));
		
		//印出考試1
		System.out.println("考卷1:");
		exam1.print();
		//印出考試2
		System.out.println("考卷2:");
		exam2.print();
		//印出考試2(移除第三題)
		exam2.removeQuestion(exam2.getQuestion(3));
		System.out.println("考卷2(移除第3題):");
		exam2.print();
	}
}
