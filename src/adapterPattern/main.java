package adapterPattern;
//adapter - 원하는 기능으로 변경하는거 , 클래스의 인터페이스를 사용자가 기대하는 다른 인터페이스로 변환하는 패턴 , 호환성이 없는 인터페이스 때문에 함께 동작할 수 없는 클래스들이 함께 작동하도록 해준다. 
//           이미 제공되어 있는것을 그대로 사용할 수 없을때 필요한 형태로 바꾸고싶을때
//요구사항 : 두 수에 대한 연산 수행하는 객체 만드시오     수의 두배의 수를 반환, 수의 반의수를 반환     구현 객체이름은 Adapter
public class main {
	public static void main(String[] args) {
		Adapter adapter = new AdapterImpl();
		System.out.println(adapter.twiceof(100f));
		System.out.println(adapter.halfof(10f));
	}
}
