package class3;

public class RunTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1 = new TV();
		TV tv2 = new TV();
		TV tv3 = new TV();
		
		tv1.setProducer("LG");
		tv1.setColor("White");
		tv1.setSize(55);
		
		tv2.setProducer("SAMSUNG");
		tv2.setColor("Black");
		tv2.setSize(65);
		
		tv3.setProducer("APPLE");
		tv3.setColor("Silver");
		tv3.setSize(77);

		System.out.println("==========================================");
		System.out.println(tv1.getProducer()+" TV");
		System.out.println(tv1.getColor()+" 색상");
		System.out.println(tv1.getSize()+" 인치");
		tv1.powerOn();
		for (int i = 0; i < 7; i++) {
			tv1.upChannerl();
		}
		for (int i = 0; i < 7; i++) {
			tv1.upvolume();
		}
		tv1.powerOff();
		System.out.println("==========================================");

		System.out.println("==========================================");
		System.out.println(tv2.getProducer()+" TV");
		System.out.println(tv2.getColor()+" 색상");
		System.out.println(tv2.getSize()+" 인치");
		tv2.powerOn();
		for (int i = 0; i < 9; i++) {
			tv2.upChannerl();
		}
		for (int i = 0; i < 9; i++) {
			tv2.upvolume();
		}
		tv2.powerOff();
		System.out.println("==========================================");

		System.out.println("==========================================");
		System.out.println(tv3.getProducer()+" TV");
		System.out.println(tv3.getColor()+" 색상");
		System.out.println(tv3.getSize()+" 인치");
		tv3.powerOn();
		for (int i = 0; i < 11; i++) {
			tv3.upChannerl();
		}
		for (int i = 0; i < 11; i++) {
			tv3.upvolume();
		}
		tv3.powerOff();
		System.out.println("==========================================");

	
	}

}
