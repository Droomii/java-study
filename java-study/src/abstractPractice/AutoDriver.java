package abstractPractice;

public class AutoDriver extends Driver{

	@Override
	public boolean canDrive(Car c) {
		if(c.getClass().equals(AutoCar.class))
			return true;
		else
			return false;
	}

	
}
