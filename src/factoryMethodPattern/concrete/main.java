package factoryMethodPattern.concrete;
//�ν��Ͻ��� �����ϴ� ������ ���ø� �޼��� �������� ������ ��   spring framework ���� ���� ���Ǵ� �� ,Ŭ������ �ν��Ͻ��� �������� ����Ŭ�������� �����ϰ� ����  ���丮 �޼ҵ� ������ �̿��ϸ� Ŭ������ �ν��Ͻ��� ����� ���� ���� Ŭ�������� �ñ�
//
// ���丮 �޼ҵ�� ��ü ������ ó���ϸ�, ���丮 �޼ҵ带 �̿��ϸ� ��ü�� �����ϴ� �۾��� ����Ŭ������ ĸ��ȭ ��ų �� ����. �̷��� �ϸ� ����Ŭ������ �ִ� Ŭ���̾�Ʈ �ڵ�� ����Ŭ������ �ִ� ��ü ���� �ڵ带 �и���Ű�� ��. 
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
