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

		// 랜덤 숫자 6개 생성
		// 중복되면 안됨 -> 중복체크
		int randNumber = 0;
		int count = 0; // 실제로 데이터가 들어가는 인덱스번호
		while (true) {
			randNumber = rand.nextInt(45) + 1;

			// 생성된 랜덤 숫자 중복체크
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

	private int[] ordering(int[] array) {// 생성된 숫자 오름차순 정렬
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

	public String print(int[] array) {// 생성된 숫자 프린트
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

	public int totalMoney(int totalCount) {// 구입금액 계산
		int money;
		money = totalCount * 2000;
		return money;
	}

}
