package test.abstract1;

public class soldier extends Weapon3 {
	//부모 클래스가 추상 클래스 = 부모클래스의 추상메소드 구현
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("탕탕탕");
	}
	public void walk() {
		System.out.println("군인이 걷는다. 터벅터벅터벅 나의 일상");
	}
}
