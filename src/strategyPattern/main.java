package strategyPattern;
// 인터페이스 : 기능의 선언과, 기능의 구현을 분리할 수 있는 기능, 어떠한 기능에 호출하는 통료     , 델리게이트 : 특정 객체 기능을 사용하기위해 다른 객체 기능을 호출하는 것
//스트레지 패턴 : 여러가지 알고리즘을 하나의 인터페이스를 만들어 접근점에서 서로 교환 가능하도록 하는 패턴
// 예제 -> 무기를 바꾸는 예제   
public class main {
	public static void main(String[] args) {
		Character character = new Character();
		character.attack();
		character.setWeapon(new Knife());
		character.attack();
		character.setWeapon(new Sword());
		character.attack();
	}
}
