package templateMethodPattern;

public abstract class AbstGameConnectHelper {
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connect(String info);
	
	public String requestConnection(String str){
		doSecurity(str);
		String id="aa"; String password="bb";
		
		if(!authentication(id, password)){
			throw new Error("�������� �ʽ��ϴ�.");
		}
		String name="username";
		int state= authorization(name);
		switch(state){
			case -1: throw new Error("10�óѾ���� ���");
			case 0: System.out.println("aa"); break;
			case 1: System.out.println("dd"); break;
			default : break;
 		}
		connect("sdfdsfsf");
		return "";
	}
}
