
public class Bus {

	int occupied;
	
	// 꼼수 메서드
	int getSeats() {
		return 20;
	}

	// 승객 1명 추가
	public void add1Passenger() {
		if (seatsAvailable()) {
			occupied += 1;
			System.out.println("잔여 좌석 : " + (getSeats() - occupied));
		} else
			System.out.println("빈 좌석이 없습니다.");
	}

	// 빈 자리가 있는지 검사하는 메서드
	private boolean seatsAvailable() {
		return occupied < getSeats();
	}
	
	public static void main(String[] args) {
		LargeBus lb = new LargeBus();
		lb.add1Passenger();
	}
}
