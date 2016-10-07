package decoratorPattern;

public class Milk extends AbsAdding {
	public Milk(IBeverage material){
		super(material);
	}

	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+50;
	}
	
	
	
}
