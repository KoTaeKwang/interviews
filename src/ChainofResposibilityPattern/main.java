package ChainofResposibilityPattern;
// 여러가지 객체가 책임을 지는것, 
public class main {
	public static void main(String[] args) {
		
		Attack attack = new Attack(100);
		
		Armor armor1 = new Armor(10);
		Armor armor2 = new Armor(15);
		
		armor1.setNextDefense(armor2);  //armor1 - armor2 
		armor1.defense(attack);
		
		System.out.println(attack.getAmount());
		
		
		
		Defence defense = new Defence() {
			
			@Override
			public void defense(Attack attack) {
				int amount = attack.getAmount();
				attack.setAmount(amount-=50);
			}
		};
		
		armor2.setNextDefense(defense); //armor2 - defense
		attack.setAmount(100);
		armor1.defense(attack);
		System.out.println(attack.getAmount());
	}
}
