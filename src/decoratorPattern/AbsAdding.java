package decoratorPattern;

public abstract class AbsAdding implements IBeverage {
	
	private IBeverage base;
	
	public AbsAdding(IBeverage base){
		super();
		this.base =base;
	}

	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}
	
	protected IBeverage getBase(){
		return this.base;
	}
}
