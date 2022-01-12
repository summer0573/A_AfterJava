package test.phone.interface1;

public interface smartPhone extends MobilePhone, MP3 {
	void installApp(String appName);
	void runApp(String appName);
}
