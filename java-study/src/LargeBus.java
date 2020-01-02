
public class LargeBus extends Bus {

	// 대형 버스에는 짐칸이 있다고 가정
	float cargoSpace = 1000f;
	float usedSpace;

	// 꼼수 메서드
	@Override
	int getSeats() {
		return 40;
	}

	// 짐 넣기
	public void loadCargo(float vol) { // vol은 짐의 부피
		if (spaceAvailable(vol)) {
			usedSpace += vol;
			System.out.println("남은 적재공잔 : " + (cargoSpace - usedSpace));
		} else
			System.out.println("짐칸에 빈 공간이 없습니다.");
	}

	// 짐을 넣을 빈 공간이 있는지 확인하는 메서드
	private boolean spaceAvailable(float vol) {
		return usedSpace + vol <= cargoSpace;
	}
}
