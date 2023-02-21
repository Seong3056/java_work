package basic;

public class PrintEx {

	public static void main(String[] args) {
		
		/*
		   자바의 표준 출력 형식은 크게 3가지다.
		   1. 개행을 포함하지 않는 print()
		   2. 자동으로 개행을 포합해 주는 println() (ln 줄바꿈)
		 */
		System.out.print("안녕하세요");
		System.out.println("hello");
		System.out.println("안녕히 가세요");
		
		//3. 형식 지정 표준출력함수 printf()
		//   서식 문자를 이용해서 문자열을 완성시킨후,
		// 서식 문자에 들어갈 값을 지정해서 출력하는 방식
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";

		System.out.printf("%d월 %d일은 %s입니다.",month,day,anni);
		/*
		  # 포맷팅 서식 문자 종류
		    %d : 부호가 있는 정수데이터(decimal)
		    %f : 실수데이터
		    %s : 문자열
		  
		  # 탈출 코드 (escape code)
		    - 반드시 " " 내에 위치 해야한다.
		    - 문자열 내에서 특정 명령을 내리고 싶을 때 사용하는 특수 기호이다.
		    \n: 줄 개행명령
		    \t: 가로 공백(스페이스 4칸)
		    
		 */
		
		// 실수를 표현하는 서식문자 %f -> 기본 6자리까지 표현
		// %.[소숫점자리]f -> 원하는 자릿수까지 표현
		// %라는 문자를 표현할땐 %% 입력
		double rate = 64.126;
		System.out.printf("\n합격률은 %.2f%%이다.",rate);
		
	}

}
