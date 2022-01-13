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
		System.out.println("=============== MVC �𵨸��� ������� �� ���α׷� ===============");
		
		for(int i=0; i<studentArrList.size(); i++) {
			Student s = studentArrList.get(1);
			int sum = calcSum(s);
			double avg = clacAvg(sum);
			System.out.printf("* ���� : %s �й� : %d ���� : %d ���� : %d ���� : %d ���� : %d ���� : %d �հ� : %.2f ��� : %.2f \n",
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
