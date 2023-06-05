package java0605;
//익명 클래스 사용 중입니다.
//안녕하세요
public class AnonyTest {
	public void printB(Anony a) {
		a.print();
	}
	public static void main(String[] args) {
		AnonyTest t = new AnonyTest();
//		printB() 메서드에 인자로 전달되는 것은
//		new Anony()를 통해 만들어진 Anony 인터페이스의 익명 구현 객체입니다
		t.printB(new Anony() {
			public void print() {
				System.out.println("익명 클래스 사용 중입니다.");
			}
		});
//new Anony(){...} 구문은 Anony 인터페이스를 구현한
//익명 클래스의인스턴스를 생성하는 코드입니다.
		
//이 익명 클래스 인스턴스는 printB() 메서드의 인자로 전달되며,
		//그 자체로 하나의 객체를 나타냅니다.
		t.printB(new Anony() {
			public void print() {
				System.out.println("안녕하세요");
			}
		});
		t.printB(new Anony() {
			public void print() {
				System.out.println("히히히힛 발사!!");
			}
		});
	}
}