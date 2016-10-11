package Mediator.main;

import Mediator.contract.Colleague;
import Mediator.contract.Mediator;

public class ChatMediator extends Mediator {

	@Override
	public void mediate(String data) {
		// TODO Auto-generated method stub
		for(Colleague colleague : colleagues){
			//중재가능성 (귓말이나 그런거) 여기서 걸러
			colleague.handle(data);
		}
	}
}
