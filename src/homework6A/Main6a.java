package homework6A;

public class Main6a {

	public static void main(String arg[]){
		Exam exam1=new Exam(),exam2=new Exam();
		
		//�ХX�Ҹ�1
		exam1.addQuestion(new Question("�j�H��l�ܪ���?"));
		exam1.addQuestion(new Question("�ߤW��ı���A�l�ܷж�?"));
		//�ХX�Ҹ�2
		exam2.addQuestion(exam1.getQuestion(2));
		exam2.addQuestion(new Question("�e�W�D�A���n����O?"));
		exam2.addQuestion(new Question("���D�e��"));
		
		//�L�X�Ҹ�1
		System.out.println("�Ҩ�1:");
		exam1.print();
		//�L�X�Ҹ�2
		System.out.println("�Ҩ�2:");
		exam2.print();
		//�L�X�Ҹ�2(�����ĤT�D)
		exam2.removeQuestion(exam2.getQuestion(3));
		System.out.println("�Ҩ�2(������3�D):");
		exam2.print();
	}
}
