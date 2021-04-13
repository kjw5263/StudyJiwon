/*
	자바에서 다형성 개념의 문법들
	
	1. 메소드 오버로딩 : 같은 이름의 메소드를 규칙에 맞게 여러개 선언한다
	2. 생성자 오버로딩 : 같은 이름의 생성자를 규칙에 맞게 여러개 선언
	3. 업캐스팅 (형변환) : 부모 클래스 타입의 참조변수 하나에 여러 자식 객체 저장
	4. 메소드 오버라이딩 : 상속관계에서 부모 클래스에 정의된 메소드를 규칙에맞게 자식클래스에 재정의
	
	업캐스팅이란?
	- 부모 클래스 타입의 참조 변수 하나에 여러 자식 객체들의 주소를 저장하여 사용할 수 있는 형태를 의미
	- 업캐스팅 : 부모 클래스 타입의 참조 변수에, 자식 객체의 주소를 저장하기 위해 부모 클래스 타입으로 형변환 시키는 것
		(형변환 - 자동 or 수동)
*/
class Parent {
	public void parentPrn() {
		System.out.println("부모 클래스 : parentPrn메소드");
	}
}

class Child extends Parent {
	public void childPrn() {
		System.out.println("자식 클래스 : childPrn 메소드");
	}
}


public class Test94 {
	public static void main(String[] args) {
		// 일반 기본 자료형의 형변환
		int a = 10;		// 4바이트 크기 a변수 메모리에 저장한 정수10 (작은 데이터)
		long b = 20;	// 8바이트 크기 b변수 메모리에 저장한 정수20 (큰 데이터)
		// 8바이트 크기 b변수 메모리에 , 4바이트 크기 a변수 메모리에 저장된 정수10 (작은데이터)를 저장하려고 할 때
		
		// 개발자가 직접 강제로 int 10을 long 10l로 데이터의 형태를 변환할 수 있다. (캐스팅으로)
		b = (long)a;	// 강제 형 변환 
		
		// 자동으로 int데이터 10을 long데이터 10l로 데이터의 형태가 자동으로 변환되어 저장됨 --> 즉, 자동 형변환이 일어남 
		b = a;
		
		
		// 참조 자료형의 형 변환(객체의 주소를 참조하는 자료형태의 형 변환)
		// 자식 객체 생성
		Child child = new Child();
		
		// Child 자식 클래스 타입의 참조변수 child로 생성한 new Child() 객체 메모리에 접근해서
		// 호출할 수 있는 메소드는 ? 2개
		child.parentPrn(); // 부모 Parent객체의 parentPrn 메소드 호출가능
		child.childPrn();  // 자식 child객체의 childPrn 메소드 호출가능
		
		
		// 업캐스팅이란?
		//		- 부모 클래스 타입의 참조 변수 하나에 여러 자식 객체들의 주소를 저장하여 사용할 수 있는 형태를 의미
			//1. 부모 클래스 타입의 참조변수 선언
		Parent p;
		
			// 2. 부모 클래스 타입의 참조변수에 자식 객체의 주소를 저장시 부모클래스 타입으로 형변환 해서	
			// 자식 객체의 주소 저장
		//p = (Parent)child;	// 업캐스팅 (강제 형변환)
		p = child;			// 업캐스팅이 일어남 (자동 형변환에 의해서)
		
		
		// 위 2.에서 업캐스팅 후에 Parent p 참조변수로 호출할 수 있는 메소드는?
		//		-> 부모클래스 내부에 있는 parentPrn() 메소드만 호출 가능하므로
		//		업캐스팅을 함으로써, 부모 클래스 타입의 참조변수 하나에
		//		여러 자식 객체의 주소를 저장해서 사용하기 때문에
		//		참조 변수를 낭비하여 여러개를 만들어놓지 않아도 되는 장점은 있지만..
		//		부모 클래스에 존재하지 않는 자식 클래스 내부의 메소드는 호출 불가능하다.
		
		
		
		
		
		
		
		
		
		
		
		
	}
}