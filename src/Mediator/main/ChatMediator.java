package Mediator.main;

import Mediator.contract.Colleague;
import Mediator.contract.Mediator;

public class ChatMediator extends Mediator {

	@Override
	public void mediate(String data) {
		// TODO Auto-generated method stub
		for(Colleague colleague : colleagues){
			//���簡�ɼ� (�Ӹ��̳� �׷���) ���⼭ �ɷ�
			colleague.handle(data);
		}
	}
}
