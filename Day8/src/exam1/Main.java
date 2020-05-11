package exam1;

public class Main {
	public static void main(String[] args) {
		Account same_account = new Account();
		Customer donator1 = new Customer(same_account, "1번째 성금자");
		Customer donator2 = new Customer(same_account, "2번째 성금자");
		donator1.start();
		donator2.start();
	}
}
