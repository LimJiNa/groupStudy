package exam1;

public class Customer extends Thread {
	Account same_a;

	Customer(Account a, String s) {
		same_a = a;
		setName(s);
	}

	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(getName() + " : " + i + "¹øÂ°");
			same_a.deposit();
			if (same_a.getTotal() >= 500000) {
				break;
			}
		}
	}
}
