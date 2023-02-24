package basic.array;

public class Enhanced_For_Loop {

	public static void main(String[] args) {
		
		
		/*
		 # 향상된 for문 (forEach)
		 - 제어변수(인덱스)의 사용없이 배열 내부의 요소를 
		   전체 참조할 수 있게 해주는 반복문
		 ex)
		 for(배열 요소를 받아줄수 있는 변수: 배열 변수명){
		 	반복 실행문~;
		 }
		 */

		String[] week = {"월","화","수","목","금","토","일"};
		
		/*for(int i=0; i<week.length;i++) {
			System.out.println(week[i]+"요일");
		}*/
		for(String day:week) {
			System.out.println(day+"요일");
		}
		
		int[] scores =  {96, 88, 74, 63, 100, 55}; //scores 배열
		int total =0;	//총합(0으로 초기화)
		for(int x:scores) {//forEach 사용
			total += x;
		}
		
		System.out.printf("총점 %d, 평균 %.2f",total,((double)total/scores.length) );
		//                    총점,  총점/배열의길이(6)
	}

}
