package test.smartphone;

import test.phone.interface1.smartPhone;

public class S21 implements smartPhone {

	@Override
	public void sendCall(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println(phoneNumber + "로 전화를 건다.");
	}

	@Override
	public void receiceCall(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println(phoneNumber + "에서 걸려온 전화를 받는다.");
	}

	@Override
	public void sendSMS(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println(phoneNumber + "로 문자 메세지를 보낸다.");
	}

	@Override
	public void receiveSMS(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println(phoneNumber + "에서 온 문자메세지를 받는다.");
	}

	@Override
	public String searchMusic(String searchWords) {
		// TODO Auto-generated method stub
		System.out.println("음악을 찾는 중입니다.");
		return searchWords + "_munsic.mp3";
	}

	@Override
	public void playMusic(String musicName) {
		// TODO Auto-generated method stub
		System.out.println(musicName+"음악을 재생합니다.");
	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub
		System.out.println(musicName+"음악을 중지합니다.");
	}

	@Override
	public void installApp(String appName) {
		// TODO Auto-generated method stub
		System.out.println(appName+"을 뭐시기 합니다");
	}

	@Override
	public void runApp(String appName) {
		// TODO Auto-generated method stub
		System.out.println(appName+"을 실행합니다.");
	}

}
