package exam1;

public class ClassA {
	Type createType(String type) {
		TypeFactory typeFactory = new TypeFactory();
		Type returnType = typeFactory.createType(type);
		return returnType;
	}
}
