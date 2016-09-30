package BuilderPattern;

public class ComputerFactory {
	private BluePrint print;
	public void setBlueprint(BluePrint print){ //´ÙÇâ¼º 
		this.print=print;
	}
	
	public void make(){
		print.setCpu();
		print.setRam();
		print.setStorage();
	}
	
	public Computer getComputer(){
		return print.getComputer();
	}
	
}
