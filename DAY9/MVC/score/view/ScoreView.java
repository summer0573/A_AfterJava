package MVC.score.view;

import java.util.ArrayList;

import MVC.score.model.Student;

public class ScoreView {
	private ArrayList<Student> studentArrList;

	public ScoreView(ArrayList<Student> studentArrList) {
		super();
		this.studentArrList = studentArrList;
	}
	public void print() {
		System.out.println("=============== MVC 모델링을 기반으로 한 프로그램 ===============");
		
		for(int i=0; i<studentArrList.size(); i++) {
			Student s = studentArrList.get(1);
			int sum = calcSum(s);
			double avg = clacAvg(sum);
			System.out.printf("* 성명 : %s 학번 : %d 국어 : %d 영어 : %d 수학 : %d 과학 : %d 역사 : %d 합계 : %.2f 평균 : %.2f \n",
					s.getName(), s.getStuId(), s.getKor(),s.getEng(),s.getMath(),s.getScience(), s.getHistory(),
					sum, avg);
		}
	}
	public int calcSum(Student s) {
		int sum = s.getKor() + s.getEng() + s.getMath() + s.getScience() + s.getHistory();
		return sum;
	}
	public double clacAvg(int sum) {
		double avg = sum / 5.0;
		return avg;
	}
}
