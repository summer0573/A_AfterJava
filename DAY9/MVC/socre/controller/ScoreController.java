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
		String subject[]= {"국어", "영어", "수학", "과학", "역사"};
		int[] Score=new int[subject.length];
		
		while(true) {
			System.out.println("* 학생 정보를 입력해주세요.");
			System.out.print("성명 : ");
			String name = s1.nextLine();
			System.out.print("학번 : ");
			int stuId=s2.nextInt();
			
			System.out.println("* 학생 성적을 입력해주세요.");
			for(int i=0; i<Score.length; i++) {
				System.out.print(subject[i]+" : ");
				Score[i] = s2.nextInt();
			}
			System.out.print("다음 학생 정보를 입력하시겠습니까?(y/n) : ");
			String contin = s1.nextLine();
			if(contin.equals("n") || contin.equals("no")) break;
		}
		//화면에 결과가 출력
		ScoreView view = new ScoreView(stdenArrayList);
		view.print();
		s1.close();
		s2.close();
		
	}

}
