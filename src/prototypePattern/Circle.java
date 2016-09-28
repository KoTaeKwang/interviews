package prototypePattern;

public class Circle extends Shape {
	public int x,y,r;
	
	public Circle(int x,int y,int r){
		this.x=x;
		this.y=y;
		this.r=r;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public Circle copy() throws CloneNotSupportedException{
		Circle circle= (Circle)clone(); //shape�� ��ӹ޾ƾ� ������  shape�� Cloneable �������̽��� ���������Ƿ� 
		
		circle.x+=1; //�߰��Ȱ�
		circle.y+=1; //�߰��Ȱ� 
		return circle;
	}
	
}
