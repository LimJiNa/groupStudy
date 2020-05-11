package ex1;

public class WaterTank {
	private int water;

	// ���� �� �ʱ�ȭ
	public WaterTank(int water) {
		this.water = water;
	}

	// amount��ŭ �� ����(���� ������ ������ ��� ����(wait()���))
	public synchronized void drain(int amount) throws InterruptedException {
		if (water == 0) {
			wait();
		} else {
			water -= amount;
			System.out.println("����" + amount + "ml ����, " + water + "ml ����");
		}
	}

	// amount��ŭ �� ����(���� ����Ǹ� notifyAll())
	public synchronized void pour(int amount) {
		water += amount;
		notifyAll();
		System.out.println(">> �� �ױ�(500ml) : " + water);
	}

	public int getWater() {
		return water;
	}
}
