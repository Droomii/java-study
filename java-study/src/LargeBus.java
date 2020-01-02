
public class LargeBus extends Bus {

	// ���� �������� ��ĭ�� �ִٰ� ����
	float cargoSpace = 1000f;
	float usedSpace;

	// �ļ� �޼���
	@Override
	int getSeats() {
		return 40;
	}

	// �� �ֱ�
	public void loadCargo(float vol) { // vol�� ���� ����
		if (spaceAvailable(vol)) {
			usedSpace += vol;
			System.out.println("���� ������� : " + (cargoSpace - usedSpace));
		} else
			System.out.println("��ĭ�� �� ������ �����ϴ�.");
	}

	// ���� ���� �� ������ �ִ��� Ȯ���ϴ� �޼���
	private boolean spaceAvailable(float vol) {
		return usedSpace + vol <= cargoSpace;
	}
}
