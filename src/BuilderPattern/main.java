package BuilderPattern;
//������ �ܰ谡 �ʿ��� �ν��Ͻ� ������ ���� ������ ���ؼ� ������ �� �ִ�.
public class main {
	public static void main(String[] args) {
		ComputerFactory factory = new ComputerFactory();
		factory.setBlueprint(new LgGramBlueprint());
		factory.make();
		Computer computer= factory.getComputer();
		System.out.println(computer.toString());
	}
}
