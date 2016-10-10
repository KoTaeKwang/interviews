package FacadePattern.system;

class system1 {
	public system1(){
		System.out.println("constructor : "+getClass().getSimpleName());
	}
	
	public void process(){
		System.out.println("call process : "+getClass().getSimpleName());
	}
}
