package enumStudy;
public enum WeekDay {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
	@Override
	public String toString() {
		String name = super.toString();
		return name.substring(0,1) + name.substring(1).toLowerCase();
	}
	
	public static void main(String[] args) {
		
		// Today is Thursday.
		System.out.printf("Today is %s.", WeekDay.THURSDAY);
	}
}
