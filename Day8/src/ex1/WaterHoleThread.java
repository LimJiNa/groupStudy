package ex1;

public class WaterHoleThread extends Thread {
	private WaterTank tank;
	private int amount;

	public WaterHoleThread(WaterTank tank, int amount) {
		this.tank = tank;
		this.amount = amount;
	}

	public void run() {
		while (true) {
			try {
				tank.drain(amount);
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
