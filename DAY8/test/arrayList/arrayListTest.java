package test.arrayList;

//java.util ��Ű�� Ŭ����
import java.util.ArrayList;

public class arrayListTest {

	public static void main(String[] args) {
		//�迭�� ���ѵ� ������ ��������� ���(�迭 ��ü ������ �� ���� ���ϱ� ����
		//ArrayList�� ���� ���� ���� �ʿ��� ��ŭ ��������� �߰�(add)�ؼ� ��� ����
		//ArrayList�� ���� ``����(remove)�ؼ� ����� �� �ִ�.

		//ArrayList ��ü ���� : GenericType(����� ����� �ڷ��� ����
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("��¹�");
		arrList.add("�̹�ȣ");
		arrList.add("������");
		arrList.add("�̿뺹");
		arrList.add("������");
		arrList.add("Ȳ����");
		arrList.add("����");
		arrList.add("��â��");
		arrList.add("������");
		
		for(int i=0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i)+"  ");
		}
		arrList.remove(6);
		arrList.remove("������");
		arrList.add("���һ�");
		System.out.println();
		for(int i=0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i)+"  ");
		}
	}

}
