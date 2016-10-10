package ObserverPattern.Observer2;

import java.util.Observable;
import java.util.Observer;

//한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들에게 연락이 가고 자동으로 내용이 갱신되는 방식 패턴
public class main {
	public static void main(String[] args) {
		Button button = new Button();
		
		button.addObserver(new Observer() {
			@Override
			public void update(Observable o, Object arg) {
					System.out.println(o+"is clicked");
				
			}
		});
		button.onClick();
		button.onClick();
		button.onClick();
	}
}
