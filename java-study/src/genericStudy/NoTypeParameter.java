package genericStudy;

public class NoTypeParameter implements Comparable<NoTypeParameter>{

	private int value;
	
	public NoTypeParameter(int pValue) {
		this.value = pValue;
	}
	
	@Override
	public int compareTo(NoTypeParameter arg0) {  // �⺻���� Object�� ����
		
		// ����ȯ�� �ʿ� ������
//		NoTypeParameter other = (NoTypeParameter)arg0;  
		return this.value - arg0.value;
	}

}
