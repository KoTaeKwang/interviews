package prototypePattern;

public class Shape implements Cloneable { //�⺻���� �������ִ� cloneable �������̽�
	public static String id;
	
	public static void setId(String id) {
		Shape.id = id;
	}
	public static String getId() {
		return id;
	}
}
