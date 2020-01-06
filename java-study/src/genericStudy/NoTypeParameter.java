package genericStudy;

public class NoTypeParameter implements Comparable<NoTypeParameter>{

	private int value;
	
	public NoTypeParameter(int pValue) {
		this.value = pValue;
	}
	
	@Override
	public int compareTo(NoTypeParameter arg0) {  // 기본값인 Object를 받음
		
		// 형변환이 필요 없어짐
//		NoTypeParameter other = (NoTypeParameter)arg0;  
		return this.value - arg0.value;
	}

}
