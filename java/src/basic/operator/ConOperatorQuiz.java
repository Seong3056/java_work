package basic.operator;

public class ConOperatorQuiz {

	public static void main(String[] args) {
		
		
		int rn = (int)((Math.random()*355)+42);
		String s = (rn % 2 == 0 ? "짝수입니다.":"홀수입니다.");
		System.out.printf("발생한 난수: %d\n",rn);
		System.out.printf("3항 연산결과: %s",s);

	}

}
