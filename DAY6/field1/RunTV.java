package test.field1;

public class RunTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t1 = new TV("Black", 55);
		TV t2 = new TV("Silver", 65);
		TV t3 = new TV("Blue", 100);
		
		System.out.printf("���� : %s, ũ�� : %d, ������ : %s\n", t1.color, t1.size, TV.PORDUCER);
		System.out.printf("���� : %s, ũ�� : %d, ������ : %s\n", t2.color, t2.size, TV.PORDUCER);
		System.out.printf("���� : %s, ũ�� : %d, ������ : %s\n", t3.color, t3.size, TV.PORDUCER);
	}

}
