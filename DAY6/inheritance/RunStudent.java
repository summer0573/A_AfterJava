package test.inheritance;

public class RunStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stu1 = new student();
		stu1.name = "±èÀ±¼­";
		stu1.weight = 50;
		stu1.height = 168;
		stu1.StuId = 1102;
		stu1.grade = 1;
		stu1.ban = 1;
		
		stu1.sleep();
		stu1.wakeUp();
		stu1.walk();
		stu1.eat();
		stu1.study();
		stu1.play();
		//student stu2 = new student();
	}

}
