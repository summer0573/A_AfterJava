package test.smartphone;

import test.phone.interface1.smartPhone;

public class S21 implements smartPhone {

	@Override
	public void sendCall(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println(phoneNumber + "�� ��ȭ�� �Ǵ�.");
	}

	@Override
	public void receiceCall(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println(phoneNumber + "���� �ɷ��� ��ȭ�� �޴´�.");
	}

	@Override
	public void sendSMS(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println(phoneNumber + "�� ���� �޼����� ������.");
	}

	@Override
	public void receiveSMS(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println(phoneNumber + "���� �� ���ڸ޼����� �޴´�.");
	}

	@Override
	public String searchMusic(String searchWords) {
		// TODO Auto-generated method stub
		System.out.println("������ ã�� ���Դϴ�.");
		return searchWords + "_munsic.mp3";
	}

	@Override
	public void playMusic(String musicName) {
		// TODO Auto-generated method stub
		System.out.println(musicName+"������ ����մϴ�.");
	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub
		System.out.println(musicName+"������ �����մϴ�.");
	}

	@Override
	public void installApp(String appName) {
		// TODO Auto-generated method stub
		System.out.println(appName+"�� ���ñ� �մϴ�");
	}

	@Override
	public void runApp(String appName) {
		// TODO Auto-generated method stub
		System.out.println(appName+"�� �����մϴ�.");
	}

}
