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
		System.out.println("ü�� ȸ�� �������� "+new Date());
		
	}
	@Override
	protected void requestItemInfo() {
		System.out.println("�����ͺ��̽����� ü�� ȸ�� ������ ���������ɴϴ�.");
	}
}
