package test.abstract1;

public class RunWeapon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soldier s = new soldier();
		Tank t = new Tank();
		Fighter f = new Fighter();
		
		s.message();
		
		s.fire();
		s.walk();
		
		t.message();
		t.fire();
		//t.forward();
		
		f.fire();
		f.fly();
	}

}
