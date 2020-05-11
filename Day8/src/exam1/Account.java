package exam1;

public class Account {
	private int total = 0;

	synchronized void deposit() {
		total = total + 1000;
	}

	int getTotal() {
		return total;
	}
}
