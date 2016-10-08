package ChainofResposibilityPattern;

public class Armor implements Defence {

	
	private Defence nextDefense;
	private int def;
	
	public Armor() {
		// TODO Auto-generated constructor stub
	}

	public Armor(int def) {
		this.def=def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	@Override
	public void defense(Attack attack) {
		process(attack);
		
		if(nextDefense!=null)
			nextDefense.defense(attack);
		
	}
	
	private void process(Attack attack){
		int amount = attack.getAmount();
		amount-=def;
		attack.setAmount(amount);
	}
	
	public void setNextDefense(Defence nextDefense){
		this.nextDefense =nextDefense;
	}

}
