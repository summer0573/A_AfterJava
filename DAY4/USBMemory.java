package Test.constructorTest;

public class USBMemory {
	private int capacity;
	private String color;
	public int getcapacity() {
		return capacity;
	}
	public String getcolor() {
		return color;
	}
	public USBMemory(int capacity) {
		this.capacity = capacity;
	}
	public USBMemory(int capacity, String color) {
		this(capacity);
		this.color = color;
	}
	public void showInfo() {
	System.out.printf("%s������ %dGB�� USB �޸�", color, capacity);	
	}
	public void readUSBMemory() {
		showInfo();
		System.out.println("�� �����͸� �д´�.");
	}
	public void writeUSBMemory() {
		showInfo();
		System.out.println("�� �����͸� �����Ѵ�.");
	}
}
