package templateMethodPattern;
//���ø��޼ҵ����� -> ������ �ü����� ���� �䱸������ ���ø� �޼ҵ� ������ �̿��Ͽ� ������ �� �ִ�.
//���� ������ ������ �������ּ���  requestConnection(String str) String
//1. ������ �������ӽ� ������ ����ؾ��մϴ�.   -> ���Ȱ���, ��������, ���Ѱ���, ���Ӱ��� 
//2. ������ ��ȭ��� , ���� ��� 10������ ���� ����! 
// Abstract, Game  �� Ŭ������ ���� ��Ű��, main �� �ϳ��� ��Ű���� �и��ؾ���     abstract ���� abstract �Լ��� protected�� �߱⶧����  �ܺο��� ���� �ȵǴϱ� 
public class main {
	public static void main(String[] args) {
		AbstGameConnectHelper helper = new GameConnectHelper();
		helper.requestConnection("����");
	}
}
