package test.final1;

public class parent {
	//final 필드는 초기화된 값만 사용할 수 있고 변경이 안된다. 필드값 변경 금지
	public static final int REST_TIME = 10;
	
	public final void rest() {
		//restTime = 20;
		System.out.println(REST_TIME + "분간 휴식한다.");
	}
	
}
