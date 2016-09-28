package prototypePattern;

public class Shape implements Cloneable { //기본으로 제공해주는 cloneable 인터페이스
	public static String id;
	
	public static void setId(String id) {
		Shape.id = id;
	}
	public static String getId() {
		return id;
	}
}
