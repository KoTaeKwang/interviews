package ObserverPattern.observer;

public class button {
	
	
	
	public void onClick(){
		if(onclicklistener!=null)
		onclicklistener.onClick(this);
	}
	
	public interface OnClickListener{
		public void onClick(button button);
	}; //������������ �ַ� ���ο��� ��
	
	private OnClickListener onclicklistener;
	
	public void setOnclicklistenr(OnClickListener onclicklistenr) {
		this.onclicklistener = onclicklistenr;
	}
}
