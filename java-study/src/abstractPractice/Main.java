package abstractPractice;

public class Main {
	public static void main(String[] args) {
		Driver d1 = new AutoDriver();
		System.out.println("-----2종 보통 운전자-----");
		System.out.print("오토 : ");
		d1.drive(new AutoCar());
		System.out.print("스틱 : ");
		d1.drive(new ManualCar());
		
		Driver d2 = new ManualDriver();
		System.out.println("-----1종 보통 운전자-----");
		System.out.print("오토 : ");
		d2.drive(new AutoCar());
		System.out.print("스틱 : ");
		d2.drive(new ManualCar());
		
		
	}
}
