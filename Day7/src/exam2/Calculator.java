package exam2;

public class Calculator {
	// ���� ��ư�� ������ �� �߻��ϴ� �̺�Ʈ
	String clickNum(String input, String num) {
		String output = input + num;
		return output;
	}

	// ������ ��ư�� ������ �� �߻��ϴ� �̺�Ʈ
	String clickOp(String input, String op) {
		String output = input + " " + op + " ";
		return output;
	}

	// op�� "="�Ͻÿ� ����ϴ� �˰���
	String calculation(String input) {
		String[] inputArr = input.split(" "); // split -> input�� ��Ʈ���� ����� �����ڴٴ� ��Ʈ���� �Լ�
		String output;
		int result = 0;

		switch (inputArr[1]) {
		case "+":
			result = Integer.parseInt(inputArr[0]) + Integer.parseInt(inputArr[2]);
			break;
		case "-":
			result = Integer.parseInt(inputArr[0]) - Integer.parseInt(inputArr[2]);
			break;
		case "*":
			result = Integer.parseInt(inputArr[0]) * Integer.parseInt(inputArr[2]);
			break;
		case "/":
			result = Integer.parseInt(inputArr[0]) / Integer.parseInt(inputArr[2]);
			break;
		case "%":
			result = Integer.parseInt(inputArr[0]) % Integer.parseInt(inputArr[2]);
			break;
		}
		output = input + " = " + result + "\n";
		return output;
	}
}
