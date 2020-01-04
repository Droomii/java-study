package wrapperStudy;

public class WrapperEquality {
	
	public static void main(String[] args) {
		int i1 = 1000;
		int i2 = 1000;
		Integer i3 = 1000;
		Integer i4 = 1000;
		Integer i5 = 123;
		Integer i6 = 123;
		
		
		System.out.println(i1==i2);  // true
		System.out.println(i3==i4);  // false
		System.out.println(i5==i6);  // true
	}
}
