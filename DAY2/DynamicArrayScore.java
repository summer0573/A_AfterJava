package TestScore;

import java.util.Scanner;

public class DynamicArrayScore {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] stuName= {"�̿뺹", "Ȳ����", "������", "������", "������"};
		System.out.print("�л� ���� �Է����ּ���. :");
		int stuNum=s.nextInt();
		int[][] scores = new int[stuNum][];
		int[] sum=new int[stuNum];
		
		//�����迭�� ��(�л���)�� ���� for��
		for (int i = 0; i < scores.length; i++) {
			System.out.print("���� ���� �Է����ּ���. :");
			int subNum=s.nextInt();
			scores[i]=new int[subNum];
			//�����迭�� ��(�����)�� ���� for��
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print((1+j)+" ���� :");
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
