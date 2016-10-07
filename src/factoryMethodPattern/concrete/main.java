package factoryMethodPattern.concrete;
//인스턴스를 생성하는 공장을 템플릿 메서드 패턴으로 구성한 것   spring framework 에서 많이 사용되는 것 ,클래스의 인스턴스를 만들지는 서브클래스에서 결정하게 만듦  팩토리 메소드 패턴을 이용하면 클래스의 인스턴스를 만드는 일을 서브 클래스에게 맡김
//
// 팩토리 메소드는 객체 생성을 처리하며, 팩토리 메소드를 이용하면 객체를 생성하는 작업을 서브클래스에 캡슐화 시킬 수 있음. 이렇게 하면 수퍼클래스에 있는 클라이언트 코드와 서브클래스에 있는 객체 생성 코드를 분리시키게 됨. 
//게임아이템과 아이템 생성을 구현해주세요  -> 아이템을 생성하기전에 데이터베이스에서 아이템 정보를 요청합니다. , 아이템을 생성후 아이템 복제등의 불법을 방지하기 위후ㅐ 데이터베이스에 아이템 생성 정보를 남깁니다.
//아이템을 생성하는 주체를 ItemCreator   , 아이템은 item 이라는 inteface   item은 use 함수를 기본함수     , 현재 아이템 종류는 체력회복물약, 등등

import factoryMethodPattern.framework.Item;
import factoryMethodPattern.framework.ItemCreator;

public class main {
	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new Hpcreator();
		item = creator.create();
		item.use();
		
		creator = new Mpcreator();
		item = creator.create();
		item.use();
	}
}
