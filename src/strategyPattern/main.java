package strategyPattern;
// �������̽� : ����� �����, ����� ������ �и��� �� �ִ� ���, ��� ��ɿ� ȣ���ϴ� ���     , ��������Ʈ : Ư�� ��ü ����� ����ϱ����� �ٸ� ��ü ����� ȣ���ϴ� ��
//��Ʈ���� ���� : �������� �˰����� �ϳ��� �������̽��� ����� ���������� ���� ��ȯ �����ϵ��� �ϴ� ����
// ���� -> ���⸦ �ٲٴ� ����   
public class main {
	public static void main(String[] args) {
		Character character = new Character();
		character.attack();
		character.setWeapon(new Knife());
		character.attack();
		character.setWeapon(new Sword());
		character.attack();
	}
}
