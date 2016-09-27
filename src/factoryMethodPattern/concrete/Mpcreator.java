package factoryMethodPattern.concrete;

import java.util.Date;

import factoryMethodPattern.framework.Item;
import factoryMethodPattern.framework.ItemCreator;

public class Mpcreator extends ItemCreator {
	@Override
	protected Item createItem() {
		return new MpPotion();
	}
	@Override
	protected void createItemLog() {
		System.out.println("마력 회복 물략생성 "+new Date());
		
	}
	@Override
	protected void requestItemInfo() {
		System.out.println("데이터베이스에서 마력 회복 물약의 정보가져옵니다.");
	}
}
