package test.inheritance;

public class student extends person {
	int StuId;
	int grade;
	int ban;
	
	public void study() {
		System.out.println("공부한다.");
	}
	public void play() {
		System.out.println("논다.");
	}
}
