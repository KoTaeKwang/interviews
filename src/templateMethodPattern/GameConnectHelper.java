package templateMethodPattern;

public class GameConnectHelper extends AbstGameConnectHelper {
	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("���̵� ����!");
		return true;
	}
	
	@Override
	protected int authorization(String userName) {
		//���̰˻��� 
		System.out.println("�̸�����Ȯ��");
		return 0;
	}
	
	@Override
	protected String connect(String info) {
		System.out.println("connect!!");
		return null;
	}
	
	@Override
	protected String doSecurity(String string) {
		System.out.println("��ȭ�� ����!");
		return null;
	}
}
