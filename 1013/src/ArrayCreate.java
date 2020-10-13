
public class ArrayCreate {

	public static void main(String[] args) {
		// 이름배열 생성 동시에 초기화
		String [] names = {"남준", "석진", "윤기","호석","지민"};
		
		//점수 3개 저장할 수 있는 배열 만들고 값 대입
		int [] scores=new int[5];
		scores[0]=34;
		scores[1]=77;
		scores[2]=84;
		
		//반복문을 사용하면 유지보수가 수월해짐
		//for(int i=0; i<3; i=i+1) {
		//	System.out.printf("이름은 %s이고 점수는 %d 입니다.\n", names[i], scores[i]);
			
		//}
		
		//3이라고 배열의 데이터 개수를 설정하는 부분을 수정
		//배열의 속성으로 설정
		//데이터가 변경이 되도 출력하는 부분은 수정할 필요가 없어짐
		for(int i=0; i<names.length; i=i+1) {
			System.out.printf("이름은 %s이고 점수는 %d 입니다.\n", names[i], scores[i]);
			
		}
		
		
		//반복문 사용하지 않고 인덱스만 이용해서 출력
		/*
		 * System.our.printf("이름은 %s이고 점수는 %d입니다.\n, names[0], scores[0]")
		 * System.our.printf("이름은 %s이고 점수는 %d입니다.\n, names[1], scores[1]")
		 * System.our.printf("이름은 %s이고 점수는 %d입니다.\n, names[2], scores[2]")
		 */
	
		
		
		
		
		//. 으로 접근하거나 [인덱스]로 데이터를 접근하게 되면 메모리를 한 번 더 찾아가야 합니다.
		//반복문 등에서 동일한 데이터를 여러 번 . 이나 [인덱스]를 이용해서 찾아가게 되면 비효율적
		//이럴 경우에는 이 데이터를 가까운 곳에 저장해두고 접근하는 것이 좋습니다.
		
		
		int len = names.length;
		for(int y=0; y<len; y=y+1) {
			System.out.printf("이름은 %s이고 점수는 %d입니다.\n", names[y], scores[y]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		String [] name= {"김연아","신예은","배수지","배주현","박기쁨"};
		//반복문 사용하여 출력
		//int a=0; a<name.length; a=a+1로 length를 넣을경우 정해진 값이 없어 수정에 용이, 유지보수에 좋다
		for(int a=0; a<name.length; a=a+1) {  //int a=name.length; a<n; a=a+1 로 n에 대입 할수도 있다, n에 넣었을 경우가 더 빠름
			System.out.printf("%s\n", name[a]);
		}
		
		//MVC (Model:Data, View, Controller)
		//Back End :비즈니스 로직을 수행해서 데이터 생성
		//Front End : 데이터를 출력
		
	}
}
	/*int len = names.length;
	 * for(inti=0; i<len; i=i+1){
	 * System.out.printf("이름은 %s이고 점수는 %d입니다.\n", names[i], scores[i]);
	 * } */
