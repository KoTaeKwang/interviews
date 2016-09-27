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
		System.out.println("���� ȸ�� �������� "+new Date());
		
	}
	@Override
	protected void requestItemInfo() {
		System.out.println("�����ͺ��̽����� ���� ȸ�� ������ ���������ɴϴ�.");
	}
}
