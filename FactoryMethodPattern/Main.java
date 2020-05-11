package exam1;

public class Main {
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		
		Type typeA = classA.createType("A");
		Type typeB = classA.createType("B");
		Type typeC = classA.createType("C");
		
		typeA.printType();
		typeB.printType();
		typeC.printType();
	}
}
