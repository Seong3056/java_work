package basic.operator;

public class ConditionalOperatorp {

	public static void main(String[] args) {
		
		/*
		 # 3항 연산자
		 - 피 연산자가 3개인 연산자
		 - (조건식 ? 좌항 : 우항);
		 - 조건식을 비교하여 true일 경우 좌항이,
		   false일 경우 우항의 값이 도출된다.
		 */

		int x = 10, y= 20;
		String result = (x > y ? "x는 y보다 크다":"x는 y보다 작다.");
		System.out.println(result);
		
		//난수를 발생시키드 메서드 math.random();
		// 0.0이상 1.0미만의 실수 난수값을 반환한다.
//		double rn = Math.random();
//		System.out.println(rn);
		
		Math.random();
		
		int rn = (int) ((Math.random()*10)+1);
		System.out.println(rn);
		
		int rn1 = (int) ((Math.random()*91)+10);
		System.out.println(rn1);
		
		int rn3 = (int) ((Math.random()*143)+34);
		System.out.println(rn3);
	}

}
