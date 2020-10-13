
public class DescriptiveStatistics {

	public static void main(String[] args) {
//		// 이름 배열
//		String [] names = {"꼬미","춘춘","삼삼","모찌"
//		};
//		for(int i=0; i<names.length; i=i+1) {
//			System.out.printf("%10s", names[i]);{
//				System.out.printf("\n");
//			}
//		}
//		
//		
//		
		//정수 배열
		int[] scores = {50, 60, 70, 80				
		};
		for(int a=0; a<scores.length; a=a+1) {
			System.out.printf("%10d", scores[a]);{
				System.out.printf("\n");
			}
		}
		
		//60점이 넘는 데이터의 합계와 개수 그리고 평균 구하기
		//평균은 소수 첫째자리까지 구하기 - 소수 둘째 자리에서 반올림
		
		int sum = 0;
		int cnt = 0;
		
		//배열 순회
		for(int score : scores) {
			//60이 넘는 데이터를 만나면 score는 sum에 추가
			//개수는 1증가
			if(score>60) {
				sum = sum + score;
				cnt = cnt + 1;
			}
			
		}
		//합계와 개수 출력
		System.out.printf("%15d", sum);
		System.out.printf("%15d", cnt);{
			System.out.printf("\n");
		}
		
		
		//평균
		//나누기를 할 때는 나누는 수가 0인지 확인하고 작업
		if(cnt==0) {
			System.out.printf("조건에 맞는 데이터가 없습니다.\n");
		}else {
			//소수 부분을 구하기 위해서 sum을 double로 형변환해서 수행
			double avg = (double)sum / cnt;
			//소수 2째 자리에서 반올림해서 출력하기 위해서
			//실수 출력 형식을 .1f로 설정
			System.out.printf("60이 넘는 데이터의 평균 : %.1f\n", avg );
			
		}
		
		
		
		
		//최대값과 최소값 구하기
		//최대값을 저장할 변수 생성 - 아주 작은 값이나 배열의 첫번째 값으로 초기화
		int max = 0;

		//최소값을 저장할 변수를 생성 - 아주 큰 값이나 배열의 첫번째 값으로 초기화
		int min = 100;
		
		//배열을 순회하면서 max나 min 보다 큰 값이나 작은 값을 만나면 그 값으로 교체
		for(int score : scores) {
			//최대값
			if(max < score) {
				max = score;
			}
			//최소값
			if(min > score) {
				min = score;
			}
		}
		
		System.out.printf("최대값 : %d\n", max);
		System.out.printf("최소값 : %d\n", min);
	}

}
