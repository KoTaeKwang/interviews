package ObserverPattern.Observer2;

import java.util.Observable;
import java.util.Observer;

//�� ��ü�� ���°� �ٲ�� �� ��ü�� �����ϴ� �ٸ� ��ü�鿡�� ������ ���� �ڵ����� ������ ���ŵǴ� ��� ����
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
