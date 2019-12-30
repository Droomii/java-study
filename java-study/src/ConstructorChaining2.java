
/**
 * @author Droomii
 * 
 * Chaining Constructors
 *
 */
public class ConstructorChaining2 {
	public int val1;
	public int val2;
	
	public ConstructorChaining2(int pVal1) {
		this.val1 = pVal1;
	}
	
	public ConstructorChaining2(int pVal1, int pVal2) {
		this(pVal1);    // ConstructorChaining2(pVal1)과 같은 기능을 합니다
		this.val2 = pVal2;
	}
}
