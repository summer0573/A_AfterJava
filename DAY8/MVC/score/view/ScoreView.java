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
			System.out.printf("* ���� : %s �й� : %d ���� : %d ���� : %d ���� : %d \n");
		}
	}
}
