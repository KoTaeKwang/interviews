package Mediator.main;

import Mediator.contract.Colleague;

public class ChatColleague extends Colleague{

	@Override
	public void handle(String data) {
		// TODO Auto-generated method stub
		System.out.println(this+data);
	}

}
