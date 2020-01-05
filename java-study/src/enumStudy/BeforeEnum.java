package enumStudy;

public class BeforeEnum {
	public static final String[] WEEKDAYS = {"월","화","수","목","금","토","일"};
	
	public static void main(String[] args) {
		
		// 요일을 가리키는 변수 - 목요일
		int weekDay = 3;

		System.out.printf("오늘은 %s요일 입니다.", WEEKDAYS[weekDay]);
	}
	
}