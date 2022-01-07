package test.access;

public class RunAccessEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseSample a1 = new BaseSample();
		a1.n1 = 100;
		a1.setN2(50);
		System.out.printf("a1.n1 = %d, a1이 참조하는 객체의 n2 = %d",a1.n1, a1.getN2());
	}

}
