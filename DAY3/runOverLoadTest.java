package class3;

public class runOverLoadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overLoadTest ot1 = new overLoadTest();
		ot1.calc(100,200);
		ot1.calc(10,20,50);
		
		System.out.println("ot1.calc(100,200) 결과 : "+ot1.getResult1());
		System.out.println("ot1.calc(10,20,50) 결과 : "+ot1.getResult2());
	}

}
