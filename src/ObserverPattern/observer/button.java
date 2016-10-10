package ObserverPattern.observer;

public class button {
	
	
	
	public void onClick(){
		if(onclicklistener!=null)
		onclicklistener.onClick(this);
	}
	
	public interface OnClickListener{
		public void onClick(button button);
	}; //옵저버패턴이 주로 내부에서 혀
	
	private OnClickListener onclicklistener;
	
	public void setOnclicklistenr(OnClickListener onclicklistenr) {
		this.onclicklistener = onclicklistenr;
	}
}
