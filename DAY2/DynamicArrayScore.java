package TestScore;

import java.util.Scanner;

public class DynamicArrayScore {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] stuName= {"이용복", "황현진", "한지성", "윤정한", "조슈아"};
		System.out.print("학생 수를 입력해주세요. :");
		int stuNum=s.nextInt();
		int[][] scores = new int[stuNum][];
		int[] sum=new int[stuNum];
		
		//동적배열의 행(학생수)에 대한 for문
		for (int i = 0; i < scores.length; i++) {
			System.out.print("과목 수를 입력해주세요. :");
			int subNum=s.nextInt();
			scores[i]=new int[subNum];
			//동적배열의 열(과목수)에 대한 for문
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print((1+j)+" 과목 :");
				scores[i][j]=s.nextInt();
				
				
			}
		}
		for (int i = 0; i < sum.length; i++) {
			System.out.print(stuName[i]+"\t");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
				sum[i]+=scores[i][j];
			}
			System.out.print(sum[i]+"\t");
			System.out.printf("%.1f\n",(double)sum[i]/scores[i].length);
		}
		s.close();
	}
}
