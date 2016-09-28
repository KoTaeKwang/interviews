package factoryMethodPattern.framework;

public abstract class ItemCreator {
	//팩토리패턴 -> 템플릿패턴 
	public Item create(){
		Item item;
		requestItemInfo();
		item = createItem();
		createItemLog();
		return item;
	}
	//아이템을 생성하기전에 데이터 베이스에서 아이템 정보 요청
	abstract protected void requestItemInfo();
	//아이템 생성 후 로그
	abstract protected void createItemLog();
	//아이템을 생성하는 알고리즘
	abstract protected Item createItem();
}
 