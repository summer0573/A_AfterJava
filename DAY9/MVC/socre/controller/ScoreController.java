package MVC.socre.controller;

import java.util.ArrayList;
import java.util.Scanner;

import MVC.score.model.Student;
import MVC.score.view.ScoreView;

public class ScoreController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stdenArrayList = new ArrayList<Student>();
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		String subject[]= {"����", "����", "����", "����", "����"};
		int[] Score=new int[subject.length];
		
		while(true) {
			System.out.println("* �л� ������ �Է����ּ���.");
			System.out.print("���� : ");
			String name = s1.nextLine();
			System.out.print("�й� : ");
			int stuId=s2.nextInt();
			
			System.out.println("* �л� ������ �Է����ּ���.");
			for(int i=0; i<Score.length; i++) {
				System.out.print(subject[i]+" : ");
				Score[i] = s2.nextInt();
			}
			System.out.print("���� �л� ������ �Է��Ͻðڽ��ϱ�?(y/n) : ");
			String contin = s1.nextLine();
			if(contin.equals("n") || contin.equals("no")) break;
		}
		//ȭ�鿡 ����� ���
		ScoreView view = new ScoreView(stdenArrayList);
		view.print();
		s1.close();
		s2.close();
		
	}

}
