package SingletonPattern;

public class systemSpeaker {
	static public systemSpeaker instance;
	private int volume;
	
	private systemSpeaker(){ //���� ���� ���ϰ� �ϱ����� private�� ����
		volume=5;
	}
	
	public static systemSpeaker getinstance(){ //�ϳ��� �ؾ��ϰ�, Ŭ���� ���������ʰ� �Լ��� �ҷ��� �ϱ⶧���� static 
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
