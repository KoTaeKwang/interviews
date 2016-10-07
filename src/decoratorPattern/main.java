package decoratorPattern;

import java.util.Scanner;

//동적으로 책임추가!할때 , 주어진 상황 및 용도에 따라 어떤 객체에 책임을 덧붙이는 패턴, 객체를 동적을 서브클래스를 이용해 확장한다.
//예제 커피제조방법    에스프레소 : 커피의 기본, 아메리카노 : 에스프레소+물, 카페라테 : 에스프레소+스팀밀크 , 헤이즐넛 : 아메리카토 + 헤이즐넛 시럽, 카페모카 : 카페라떼 + 초콜릿, 카라멜마키야또 : 카페라떼 + 카라멜시럽

public class main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IBeverage beverage = new Base();
		boolean done = false;
		
		while(!done){
			System.out.println("음료 현재 가격 : "+beverage.getTotalPrice());
			System.out.println("손택 : 1 : 샷추가 / 2 : 우유추가");
			switch (sc.nextInt()) { 
			case 0: done=true; break;
			case 1: beverage=new Espresso(beverage); break;
			case 2: beverage=new Milk(beverage); break;
			}
		}
		
		System.out.println("총 음료 가격"+beverage.getTotalPrice());
		sc.close();
	}
	
}
