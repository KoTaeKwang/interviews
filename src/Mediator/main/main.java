package Mediator.main;

import Mediator.contract.Colleague;
import Mediator.contract.Mediator;
//모든 클래스간의 복잡한 로직을 캡슐화하여 하나의 클래스에 위임하여 처리하는 패턴 
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mediator mediator = new ChatMediator();
		
		Colleague colleague1 = new ChatColleague();
		Colleague colleague2 = new ChatColleague();
		Colleague colleague3 = new ChatColleague();
		
		colleague1.join(mediator);
		colleague2.join(mediator);
		colleague3.join(mediator);
		
		colleague1.sendData("AAA");
		colleague2.sendData("BBB");
		colleague3.sendData("CCC");
	}

}
