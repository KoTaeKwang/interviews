package FacadePattern.facade;

import FacadePattern.system.facade;

//복잡한 것을 간단하게 
public class main {
	public static void main(String[] args) {
		facade fa = new facade();
		fa.process();
	}
}
