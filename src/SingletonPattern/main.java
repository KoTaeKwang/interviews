package SingletonPattern;
// �����߿� �ý��ۿ��� ����Ŀ�� ������ �� �ִ� Ŭ������ ������ֶ� 
// �ϳ��� �ν��Ͻ��� �۾��ϴ� ��
public class main {

	public static void main(String[] args) {
		systemSpeaker speaker1 =systemSpeaker.getinstance();
		systemSpeaker speaker2 =systemSpeaker.getinstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(11);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker2.setVolume(33);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
	}
}
