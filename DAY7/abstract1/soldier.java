package test.abstract1;

public class soldier extends Weapon3 {
	//�θ� Ŭ������ �߻� Ŭ���� = �θ�Ŭ������ �߻�޼ҵ� ����
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
	public void walk() {
		System.out.println("������ �ȴ´�. �͹��͹��͹� ���� �ϻ�");
	}
}
