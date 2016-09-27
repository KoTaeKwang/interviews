package factoryMethodPattern.concrete;

import factoryMethodPattern.framework.Item;

public class MpPotion implements Item {
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("마력회복");
	}
}
