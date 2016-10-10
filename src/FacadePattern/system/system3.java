package FacadePattern.system;

class system3 {
	public system3(){
		System.out.println("constructor : "+getClass().getSimpleName());
	}
	
	public void process(){
		System.out.println("call process : "+getClass().getSimpleName());
	}
}
