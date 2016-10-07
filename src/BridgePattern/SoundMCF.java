package BridgePattern;

public class SoundMCF implements MorseCodeFunction {

	@Override
	public void dot() {
		System.out.print("´å");
	}

	@Override
	public void dash() {
		System.out.print("´ñ");
	}

	@Override
	public void space() {
		System.out.print(" ");
		
	}
}
