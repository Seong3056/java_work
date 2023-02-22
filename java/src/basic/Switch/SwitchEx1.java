package basic.Switch;

import java.util.Scanner;

public class SwitchEx1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력 (M/F)");
		System.out.print("> ");
		String gender = sc.next();
		
		/*
		 - switch 키워드 뒤에 나오는 괄호는 boolean형 조건식이 아닌
		   변수 또는 변수의 연산식을 적어야 하며 타입은 정수, 문자열만 가능합니다.
		 */
		switch (gender) {
		/*
		 * switch 괄호 안에 지정한 기준값에 따라 
		 * 만족하는 case문을 순서대로 탐색한다
		 * 적합한 case가 존재하는 경우에는 해당 case에 
		 * 중속된 문장을 실행한다.
		 * 따로 조치가 없다면 나머지 케이스들이 연속적을 실행된다.
		 */
		
		
		
		case "M": case "m": case "ㅡ":
			System.out.println("남자 입니다.");
			break; //해당 case만 실행하고 switch문을 종료
		case "F": case "f": case "ㄹ":
			System.out.println("여자 입니다.");
			break;
		default : //case를 설정하지 않은 값들은 모두 default 값으로 가게 된다
			System.out.println("잘못된 입력입니다.");
		}
		sc.close();
		
	}
}
