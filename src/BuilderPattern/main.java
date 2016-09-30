package BuilderPattern;
//복잡한 단계가 필요한 인스턴스 생성을 빌더 패턴을 통해서 구현할 수 있다.
public class main {
	public static void main(String[] args) {
		ComputerFactory factory = new ComputerFactory();
		factory.setBlueprint(new LgGramBlueprint());
		factory.make();
		Computer computer= factory.getComputer();
		System.out.println(computer.toString());
	}
}
