package ObserverPattern.observer;



import ObserverPattern.observer.button.OnClickListener;

public class main {
	public static void main(String[] args) {
		button button = new button();
		
		button.setOnclicklistenr(new OnClickListener() {
			@Override
			public void onClick(button button) {
				System.out.println(button+"is clicked");
			}
		});
		button.onClick();
	}
}

