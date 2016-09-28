package SingletonPattern;

public class systemSpeaker {
	static public systemSpeaker instance;
	private int volume;
	
	private systemSpeaker(){ //새로 생성 못하게 하기위해 private로 선언
		volume=5;
	}
	
	public static systemSpeaker getinstance(){ //하나만 해야하고, 클래스 생성하지않고 함수를 불러야 하기때문에 static 
		if(instance==null){
			instance= new systemSpeaker();
		}
		return instance;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
}
