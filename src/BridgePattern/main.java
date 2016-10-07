package BridgePattern;
// 브리지패턴  - 기능부분과 구현부분 분리   , 많이사용되진않아 , adapter 패턴이랑흡사
public class main {
	public static void main(String[] args) {
		
		PrintMorseCode code = new PrintMorseCode(new SoundMCF());
		
		//code.g();code.a();code.r();code.a();code.m();
		code.g().a().r().a().m();
	}
}
