package FacadePattern.system;

class system2 {
	public system2(){
		System.out.println("constructor : "+getClass().getSimpleName());
	}
	
	public void process(){
		System.out.println("call process : "+getClass().getSimpleName());
	}
}
