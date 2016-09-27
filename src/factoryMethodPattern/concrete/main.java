package factoryMethodPattern.concrete;
//인스턴스를 생성하는 공장을 템플릿 메서드 패턴으로 구성한 것
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
