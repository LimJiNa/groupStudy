package ex1;

public class WaterTank {
	private int water;

	// 물의 양 초기화
	public WaterTank(int water) {
		this.water = water;
	}

	// amount만큼 물 빠짐(물이 없으면 스레드 대기 상태(wait()사용))
	public synchronized void drain(int amount) throws InterruptedException {
		if (water == 0) {
			wait();
		} else {
			water -= amount;
			System.out.println("물이" + amount + "ml 빠짐, " + water + "ml 남음");
		}
	}

	// amount만큼 물 보충(물이 보충되면 notifyAll())
	public synchronized void pour(int amount) {
		water += amount;
		notifyAll();
		System.out.println(">> 물 붓기(500ml) : " + water);
	}

	public int getWater() {
		return water;
	}
}
