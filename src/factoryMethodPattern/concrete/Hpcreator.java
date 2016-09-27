package factoryMethodPattern.concrete;

import java.util.Date;

import factoryMethodPattern.framework.Item;
import factoryMethodPattern.framework.ItemCreator;

public class Hpcreator extends ItemCreator {
	@Override
	protected Item createItem() {
		return new HpPotion();
	}
	@Override
	protected void createItemLog() {
		System.out.println("체력 회복 물략생성 "+new Date());
		
	}
	@Override
	protected void requestItemInfo() {
		System.out.println("데이터베이스에서 체력 회복 물약의 정보가져옵니다.");
	}
}
