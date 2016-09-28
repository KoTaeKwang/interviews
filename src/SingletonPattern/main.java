package SingletonPattern;
// 개발중에 시스템에서 스피커에 접근할 수 있는 클래스를 만들어주라 
// 하나의 인스턴스로 작업하는 것
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
