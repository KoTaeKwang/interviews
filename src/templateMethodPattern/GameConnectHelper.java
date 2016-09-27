package templateMethodPattern;

public class GameConnectHelper extends AbstGameConnectHelper {
	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디 인증!");
		return true;
	}
	
	@Override
	protected int authorization(String userName) {
		//나이검사해 
		System.out.println("이름인증확인");
		return 0;
	}
	
	@Override
	protected String connect(String info) {
		System.out.println("connect!!");
		return null;
	}
	
	@Override
	protected String doSecurity(String string) {
		System.out.println("강화된 보안!");
		return null;
	}
}
