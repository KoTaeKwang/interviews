package prototypePattern;
//프로토타입 패턴은 생산비용이 높은 인스턴스를 복사하는 것 ,  생산비용이 높은 인스턴스 경우-> 클래스로부터 인스턴스 생성이 어려운 경우
//그림 그리기 툴을 개발 중, 어떤 모양을 그릴 수 있도록 하고 복사 붙여넣기 기능을 구현해 달라
// 추가 -> 옆으로 복사 붙여넣기 해달라 
// 얕은복사, 깊은복사   얕은복사 : 주소만 복사하는거  circle1=circle2 하면되는거야 ,   깊은복사  : 주소말고 그 값들을 복사하는거 -> clone을 해야해 copy 함수만들고 
public class main {
	 public static void main(String[] args) throws CloneNotSupportedException {
		 Circle circle1 = new Circle(1, 1, 2);
		 Circle circle2 = circle1.copy();
		 
		 System.out.println(circle1.getX()+", "+circle1.getY()+", "+circle1.getR());
		 System.out.println(circle2.getX()+", "+circle2.getY()+", "+circle2.getR());
	}
}
