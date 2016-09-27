package factoryMethodPattern.concrete;

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
