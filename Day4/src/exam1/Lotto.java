package exam1;

import java.util.Random;

public class Lotto {

	Random rand = new Random();

	public int[] generate() {
		int[] numbers = createNumbers();
		int[] ordering = ordering(numbers);
		return ordering;
	}

	private int[] createNumbers() {
		int[] results = new int[6];
		boolean isNotDuplicated = true;

		// ���� ���� 6�� ����
		// �ߺ��Ǹ� �ȵ� -> �ߺ�üũ
		int randNumber = 0;
		int count = 0; // ������ �����Ͱ� ���� �ε�����ȣ
		while (true) {
			randNumber = rand.nextInt(45) + 1;

			// ������ ���� ���� �ߺ�üũ
			for (int j = 0; j < count; j++) {
				if (results[j] == randNumber) {
					isNotDuplicated = false;
					break;
				} else {
					isNotDuplicated = true;
				}
			}

			if (isNotDuplicated) {
				results[count++] = randNumber;
			}

			if (count > 5) {
				break;
			}
		}
		return results;
	}

	private int[] ordering(int[] array) {// ������ ���� �������� ����
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public String print(int[] array) {// ������ ���� ����Ʈ
		int valuse;
		String print1 = "";
		String print2 = "";
		String str = ", ";
		for (int i = 0; i < array.length; i++) {
			valuse = array[i];
			if (i == 5) {
				print1 = valuse + "";
			} else {
				print2 = print2 + valuse + str;
			}
		}
		return print2 + print1;
	}

	public int totalMoney(int totalCount) {// ���Աݾ� ���
		int money;
		money = totalCount * 2000;
		return money;
	}

}
