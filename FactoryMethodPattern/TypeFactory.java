package exam1;

public class TypeFactory {
	Type createType(String type) {
		Type returnType = null;
		
		switch(type) {
		case "A":
			returnType = new TypeA();
			break;
		case "B":
			returnType = new TypeB();
			break;
		case "C":
			returnType = new TypeC();
			break;
		}
		
		return returnType;
	}
}