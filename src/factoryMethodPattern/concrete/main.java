package factoryMethodPattern.concrete;
//�ν��Ͻ��� �����ϴ� ������ ���ø� �޼��� �������� ������ ��
//���Ӿ����۰� ������ ������ �������ּ���  -> �������� �����ϱ����� �����ͺ��̽����� ������ ������ ��û�մϴ�. , �������� ������ ������ �������� �ҹ��� �����ϱ� ���Ĥ� �����ͺ��̽��� ������ ���� ������ ����ϴ�.
//�������� �����ϴ� ��ü�� ItemCreator   , �������� item �̶�� inteface   item�� use �Լ��� �⺻�Լ�     , ���� ������ ������ ü��ȸ������, ���

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
