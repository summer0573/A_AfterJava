package test.This2;

public class RunCircle {
	
	public static void showPrint(Circle c) {
		System.out.printf("�������� %d���� ���� �ѷ��� %.2f��\n",c.getR(), c.getCircum());
		System.out.printf("�������� %d���� ���� �ѷ��� %.2f��\n",c.getR(), c.getArea());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(15);
		c1.showInfo();
		Circle c2 = new Circle(6);
		c2.showInfo();
	}

}
