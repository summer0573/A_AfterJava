package Test.constructorTest;

public class RunConstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorTest1 ct1 = new ConstructorTest1(10);
		ConstructorTest1 ct2 = new ConstructorTest1(77);
		
		System.out.printf("ct1�� �����ϴ� ��ü�� �ʵ� n = %d\n", ct1.getN());
		System.out.printf("ct2�� �����ϴ� ��ü�� �ʵ� n = %d\n", ct2.getN());
	}

}
