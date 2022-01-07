package test.access;

public class ThisTest1 {
	private int n;
	public void power(int n) {
		this.n = n*n;
		System.out.printf("%dÀÇ Á¦°ö½ÂÀº %dÀÌ´Ù.\n", n, this.n);
	}
}
