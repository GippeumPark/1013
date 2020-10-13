
public class Matrix {

	public static void main(String[] args) {
		// 문자열 2차원 배열을 생성
		String [][] names = {
				{"남준", "석진", "윤기"},
				{"호석", "지민", "태형"}
		};

//		
//		//행의 순회
//		for(int i=0; i<names.length; i=i+1) {
//			//열의 순회
//			for(int j=0; j<names[i].length; j=j+1) {
//				System.out.printf("%10s", names[i][j]);
//			}
//			System.out.printf("\n");
//		}


		
		
		
		
		/*
		//빠른 열어 이용
		//배열의 배열이므로 처음에는 배열에 저장하고
		for(String[] bangtan : names) {
			//그 배열을 다시 순서대로 순회
			for(String imsi : bangtan) {
				System.out.printf("%10s", imsi);
			}
			System.out.printf("\n");
		}
		*/
		
		

		
		
		//일차원 배열을 이차원 배열 처럼 이용
		//이 구조는 실무에서도 많이 이용
		String [] singer = {"최효정", "유시아", "배유빈", "최승희", "최지호", "최아린"
		};
		for(int i=0; i<singer.length; i=i+1) {
			System.out.printf("%10s", singer[i]);
			if(i%3==0) {
				System.out.printf("\n");
			}
		}
	}

}
