package test.arrayList;

//java.util 패키지 클래스
import java.util.ArrayList;

public class arrayListTest {

	public static void main(String[] args) {
		//배열은 제한된 개수의 저장공간을 사용(배열 객체 생성할 때 개수 정하기 때문
		//ArrayList는 개수 제한 없이 필요한 만큼 저장공간을 추가(add)해서 사용 가능
		//ArrayList는 개주 ``삭제(remove)해서 사용할 수 있다.

		//ArrayList 객체 생성 : GenericType(저장될 요소의 자료형 설정
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("김승민");
		arrList.add("이민호");
		arrList.add("한지성");
		arrList.add("이용복");
		arrList.add("정현진");
		arrList.add("황현진");
		arrList.add("방찬");
		arrList.add("서창빈");
		arrList.add("양정인");
		
		for(int i=0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i)+"  ");
		}
		arrList.remove(6);
		arrList.remove("정현진");
		arrList.add("제왑삐");
		System.out.println();
		for(int i=0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i)+"  ");
		}
	}

}
