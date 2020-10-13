
public class PerfectNumber {

	public static void main(String[] args) {
		// 2부터 1000까지 완전수의 개수 구하기
		// 완전수는 자기 자신을 제외한 약수의 합이 자기 자신과 동일한 숫자
		
		
		int cnt = 0;
		
		for(int a=1; a<=1000; a=a+1) {
			int sum = 1;
			for(int b=2; b<=a/b; b=b+1) {
				if(a%b==0) {
					sum=sum+1;
				}
				
			}
				if(a==sum);{
					cnt=cnt+1;

					System.out.printf("완전수 :" + a);
				
			}
		}
		

	}

}
