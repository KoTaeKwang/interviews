package templateMethodPattern;
//템플릿메소드패턴 -> 일정한 플세스를 가진 요구사항을 템플릿 메소드 패턴을 이용하여 구현할 수 있다.
//신작 게임의 접속을 구현해주세요  requestConnection(String str) String
//1. 유저가 게임접속시 다음을 고려해야합니다.   -> 보안과정, 인증과정, 권한과정, 접속과정 
//2. 보안이 강화됬어 , 나이 어리면 10시이후 접속 제한! 
// Abstract, Game  둘 클래스가 같은 패키지, main 이 하나의 패키지로 분리해야해     abstract 에서 abstract 함수들 protected로 했기때문에  외부에서 보면 안되니까 
public class main {
	public static void main(String[] args) {
		AbstGameConnectHelper helper = new GameConnectHelper();
		helper.requestConnection("요요요");
	}
}
