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
			throw new Error("존재하지 않습니다.");
		}
		String name="username";
		int state= authorization(name);
		switch(state){
			case -1: throw new Error("10시넘었어요 어린이");
			case 0: System.out.println("aa"); break;
			case 1: System.out.println("dd"); break;
			default : break;
 		}
		connect("sdfdsfsf");
		return "";
	}
}
