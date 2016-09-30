package BuildPattern2;

import BuilderPattern.Computer;

//많은 인자를 가진 객체를 생성을 다른 객체의 도움으로 생성하는 패턴    가독성을 좋게 한다.
public class main {
	public static void main(String[] args) {	
		Computer computer= ComputerBuilder
				.start()
				.setCpu("i7")
				.setRam("8g")
				.build();
		
		System.out.println(computer.toString());
	}
}
