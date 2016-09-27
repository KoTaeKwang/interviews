package factoryMethodPattern.framework;

public abstract class ItemCreator {
	
	public Item create(){
		Item item;
		requestItemInfo();
		item = createItem();
		createItemLog();
		return item;
	}
	//�������� �����ϱ����� ������ ���̽����� ������ ���� ��û
	abstract protected void requestItemInfo();
	//������ ���� �� �α�
	abstract protected void createItemLog();
	//�������� �����ϴ� �˰���
	abstract protected Item createItem();
}
 