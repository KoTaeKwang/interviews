package BridgePattern;
// �긮������  - ��ɺκа� �����κ� �и�   , ���̻������ʾ� , adapter �����̶����
public class main {
	public static void main(String[] args) {
		
		PrintMorseCode code = new PrintMorseCode(new SoundMCF());
		
		//code.g();code.a();code.r();code.a();code.m();
		code.g().a().r().a().m();
	}
}
