package genericStudy;

public class WithTypeParameter implements Comparable<WithTypeParameter>{

	private int value;
	
	public WithTypeParameter(int pValue) {
		this.value = pValue;
	}

	@Override
	public int compareTo(WithTypeParameter o) {
		return this.value - o.value;
	}
	

}
