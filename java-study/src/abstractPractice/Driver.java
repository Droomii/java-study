package abstractPractice;

public abstract class Driver {
	public void drive(Car c) {
		if(canDrive(c))
			System.out.println("�θ��θ�");
		else
			System.out.println("�ڰ��� �����ϴ�.");
	}
	
	public abstract boolean canDrive(Car c);
}
