package Test.overLoad;

import java.util.Scanner;

public class RunMethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		methodOverloadTest ot = new methodOverloadTest();
		int n1, n2;
		System.out.print("����1 �Է� : ");
		n1=sc.nextInt();
		System.out.print("����2 �Է� : ");
		n2=sc.nextInt();
		System.out.printf("%d + %d = %d\n",n1, n2, ot.calc(n1,n2));
		
		double n3 = 12.5, n4 = 21.3;
		System.out.print("����1 �Է� : ");
		n3=sc.nextDouble();
		System.out.print("����2 �Է� : ");
		n4=sc.nextDouble();
		System.out.printf("%.1f * %.1f = %.3f\n",n3,n4,ot.calc(n3, n4));
	}
}
