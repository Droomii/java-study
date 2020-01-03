package abstractPractice;

public abstract class Driver {
	public void drive(Car c) {
		if(canDrive(c))
			System.out.println("부릉부릉");
		else
			System.out.println("자격이 없습니다.");
	}
	
	public abstract boolean canDrive(Car c);
}
