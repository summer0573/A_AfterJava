package test.constructor2;

public class ClsB extends ClsA {
	public ClsB() {
		System.out.println("ClsB()의 생성자 호출");
	}
	public ClsB(int n) {
		super(n);
		System.out.println("ClsB(int n)의 생성자 호출 : "+n);
	}
}
