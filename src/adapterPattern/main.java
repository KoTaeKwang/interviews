package adapterPattern;
//adapter - ���ϴ� ������� �����ϴ°� , Ŭ������ �������̽��� ����ڰ� ����ϴ� �ٸ� �������̽��� ��ȯ�ϴ� ���� , ȣȯ���� ���� �������̽� ������ �Բ� ������ �� ���� Ŭ�������� �Բ� �۵��ϵ��� ���ش�. 
//           �̹� �����Ǿ� �ִ°��� �״�� ����� �� ������ �ʿ��� ���·� �ٲٰ������
//�䱸���� : �� ���� ���� ���� �����ϴ� ��ü ����ÿ�     ���� �ι��� ���� ��ȯ, ���� ���Ǽ��� ��ȯ     ���� ��ü�̸��� Adapter
public class main {
	public static void main(String[] args) {
		Adapter adapter = new AdapterImpl();
		System.out.println(adapter.twiceof(100f));
		System.out.println(adapter.halfof(10f));
	}
}
