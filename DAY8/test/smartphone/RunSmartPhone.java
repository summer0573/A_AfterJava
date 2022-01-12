package test.smartphone;

public class RunSmartPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S21 s = new S21();
		s.sendCall("010-2222-3333");
		s.receiveSMS("010-7777-5555");
		s.installApp("Goole Map");
		String music= s.searchMusic("DNA");
		s.playMusic(music);
		s.stopMusic();
	}

}
