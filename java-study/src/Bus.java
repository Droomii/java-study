
public class Bus {

	int occupied;
	
	// �ļ� �޼���
	int getSeats() {
		return 20;
	}

	// �°� 1�� �߰�
	public void add1Passenger() {
		if (seatsAvailable()) {
			occupied += 1;
			System.out.println("�ܿ� �¼� : " + (getSeats() - occupied));
		} else
			System.out.println("�� �¼��� �����ϴ�.");
	}

	// �� �ڸ��� �ִ��� �˻��ϴ� �޼���
	private boolean seatsAvailable() {
		return occupied < getSeats();
	}
	
	public static void main(String[] args) {
		LargeBus lb = new LargeBus();
		lb.add1Passenger();
	}
}
