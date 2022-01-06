package Test.constructorTest;

public class RunUsbMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USBMemory usb1 = new USBMemory(64, "black&Silver");
		USBMemory usb2 = new USBMemory(256, "Red");
		
		usb1.writeUSBMemory();
		usb1.readUSBMemory();
		System.out.println("---------------------------------");
		usb2.readUSBMemory();
	}

}
