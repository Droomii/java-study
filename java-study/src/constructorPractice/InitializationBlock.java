package constructorPractice;

public class InitializationBlock {

	int val1;
	char val2;
	int[] values;

	{
		int[] values = new int[10];
		for (int i = 0; i < values.length; i++) {
			values[i] = 1;
		}
	}
	
	public InitializationBlock() {}

	public InitializationBlock(int pVal1) {
		this.val1 = pVal1;
	}

	public InitializationBlock(char pVal2) {
		this.val2 = pVal2;
	}
}
