
public class runClassAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classAdd a1= new classAdd();
		classAdd a2 = new classAdd();
		
		a1.setN1(10);
		a1.setN2(20);
		a1.addNum();
		System.out.printf("%d + %d = %d\n", a1.getN1(), a1.getN2(), a1.getResult());
		//System.out.println("a1.result = "+a1.getResult());
		a2.setN1(150);
		a2.setN2(200);
		a2.addNum();
		System.out.printf("%d + %d = %d\n", a2.getN1(), a2.getN2(), a2.getResult());
	}
}
