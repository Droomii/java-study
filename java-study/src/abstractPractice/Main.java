package abstractPractice;

public class Main {
	public static void main(String[] args) {
		Driver d1 = new AutoDriver();
		System.out.println("-----2�� ���� ������-----");
		System.out.print("���� : ");
		d1.drive(new AutoCar());
		System.out.print("��ƽ : ");
		d1.drive(new ManualCar());
		
		Driver d2 = new ManualDriver();
		System.out.println("-----1�� ���� ������-----");
		System.out.print("���� : ");
		d2.drive(new AutoCar());
		System.out.print("��ƽ : ");
		d2.drive(new ManualCar());
		
		
	}
}
