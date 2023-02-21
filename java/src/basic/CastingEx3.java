package basic;


public class CastingEx3 {

	public static void main(String[] args) {
		
		/*
		 - 서로 타입이 다른 기본 데이터의연산 시에는 데이터 타입이 큰쪽에
		   작은쪽이 맞춰져서 자동으로 형 변환 후 연산이 진행된다.
		 * */
		char c = 'B' ;
		int i = 2;
		
		int iResult = c + i;
		char cResult = (char) (c + i);
		
		System.out.println(iResult);
		System.out.println(cResult);
		
		int k = 10;
		double d = (double) k / 4; 
		//            or    k / 4.0
		System.out.println(d);
		
		//int보다 작은 크기의 데이터 연산은 자동으로 값이
		//int로 변환되어 처리됩니다. (데이터 손실의 방지)
		byte b1 = 100;
		byte b2 = 70;
		System.err.println(b1 + b2);	
		int []name = new int[4];
	}
	
}
