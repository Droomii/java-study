package enumStudy;

public class Main {
	public static void main(String[] args) {
		WeekDay wd = WeekDay.SATURDAY;  // 토요일
		String wdString = "";
		
		switch (wd) {
		case MONDAY:
			wdString = "월";
			break;
		case TUESDAY:
			wdString = "화";
			break;
		case WEDNESDAY:
			wdString = "수";
			break;
		case THURSDAY:
			wdString = "목";
			break;
		case FRIDAY:
			wdString = "금";
			break;
		case SATURDAY:
			wdString = "토";
			break;
		case SUNDAY:
			wdString = "일";
			break;
		}
		
		// 오늘은 토요일 입니다.
		System.out.printf("오늘은 %s요일 입니다.\n", wdString);
		
		// today is SATURDAY
		System.out.printf("Today is %s", wd);
	}
}
