package prototypePattern;
//������Ÿ�� ������ �������� ���� �ν��Ͻ��� �����ϴ� �� ,  �������� ���� �ν��Ͻ� ���-> Ŭ�����κ��� �ν��Ͻ� ������ ����� ���
//�׸� �׸��� ���� ���� ��, � ����� �׸� �� �ֵ��� �ϰ� ���� �ٿ��ֱ� ����� ������ �޶�
// �߰� -> ������ ���� �ٿ��ֱ� �ش޶� 
// ��������, ��������   �������� : �ּҸ� �����ϴ°�  circle1=circle2 �ϸ�Ǵ°ž� ,   ��������  : �ּҸ��� �� ������ �����ϴ°� -> clone�� �ؾ��� copy �Լ������ 
public class main {
	 public static void main(String[] args) throws CloneNotSupportedException {
		 Circle circle1 = new Circle(1, 1, 2);
		 Circle circle2 = circle1.copy();
		 
		 System.out.println(circle1.getX()+", "+circle1.getY()+", "+circle1.getR());
		 System.out.println(circle2.getX()+", "+circle2.getY()+", "+circle2.getR());
	}
}
