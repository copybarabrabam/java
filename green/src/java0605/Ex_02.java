package java0605;

//추상 클래스의 변형, 인터페이스는 추상클래스와 유사하지만 클래스가 아니다. 
//클래스처럼 상속을 해주지만 클래스가 아니므로 다수의 인터페이스의 상속을 받는 것도 가능하다. 
//인터페이스는 interface I_NAME 이런 식으로 선언하며
//인터페이스에서 상속은 class C_NAME implements I_NAME 이런식으로 쓰인다. 
//추상 클래스는 설계와 구현을 분리시키기 위해서
interface PhoneInterface {
//	인터페이스에서 선언되는 필드 변수는 모두 상수 변수(final)이다. 
//	아니어도 되지만 대부분 그렇게 사용한다. 
	final int TIMEOUT = 10000;

	void sendCall();

	void receiveCall();

//default 메서드: 인터페이스의 메서드 중 하나는 일반 클래스의 메서드처럼 동작이 정의될 수 있다. 
//default 메서드를 활용하면 자바에서도 다중상속을 할 수 있다.
	default void printLogo() { // default 메서드
//interface 내부에 메서드, 맞기만 하면 가져다 쓸수 있는 것이다.
		System.out.println("**Phone**");
	}
}

//인터페이스 구현은 implements 키워드 활용
//인터페이스는 두 개의 오버라이딩을 받을 수 있는 것인가 그럼?
//		다중으로 인터페이스 다중 상속을 받을 수 있는 것!! Ex_03을 살펴보자
class SamsungPhone implements PhoneInterface {
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}//오버라이드재정의하는문법적으로 검사하는 것

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}//@ 앳 이라고불리우고 어노테이션의 약어이다.

	public void flash() {
		System.out.println("전화에 불이 켜졌습니다.");
	}//추상클래스와 인터페이스는 객체생성을할수없다
}

public class Ex_02 {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
//그래서 자체로는 객체생성이 불가하나, 이를사용하려면 추상클래스를
//일반클래스에 상속하여 객체를생성할 수있다.
//2) 익명 이너 클래스를 사용하면 컴파일러가 내부적으로 클래스를 생성한 수 메서드 오버라이드를 수행
//클래스 이름을 알 수 없다 (1회용이다)
//미완성 메서드로 완성하여 해당객체를 생성할 수 있다