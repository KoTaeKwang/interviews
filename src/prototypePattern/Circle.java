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
		Circle circle= (Circle)clone(); //shape를 상속받아야 가능해  shape가 Cloneable 인터페이스를 구현했으므로 
		
		circle.x+=1; //추가된거
		circle.y+=1; //추가된거 
		return circle;
	}
	
}
