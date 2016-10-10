package FacadePattern.system;

public class facade {
	
	private system1 s1;
	private system2 s2;
	private system3 s3;
	
	
	public facade(){
		s1  =new system1();
		s2  =new system2();
		s3  =new system3();
	}
	public void process(){
		s1.process();
		s2.process();
		s3.process();
	}

}
