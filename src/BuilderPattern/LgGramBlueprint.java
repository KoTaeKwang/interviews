package BuilderPattern;

public class LgGramBlueprint extends BluePrint{
	private Computer computer;
	
	public LgGramBlueprint() {
		computer=new Computer("default", "default", "default");
	}
	
	@Override
	public void setCpu() {
		computer.setCpu("I7");
	}

	@Override
	public void setRam() {
		computer.setRam("8g");
	}

	@Override
	public void setStorage() {
		computer.setStorage("ssd");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

}
