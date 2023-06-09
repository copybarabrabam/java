package java0608;
//try/catch문으로 예외 처리를 하지 않은 경우
//1. 예외가 발생하면 JVM에게 예외를 던진다. throws
//2. JVM은 발생한 예외를 분석한 후 ArrayIndexOutOfBoundsException 객체를 생성한다. 
//3. JVM은 생성된 예외 객체를 발생된 곳으로 던진다. 
//4. 예외가 발생한 곳에서 예외 처리를 하지 않으면 프로그램이 비정상종료된다.

public class ArrayUtil {
	public void call() throws Exception{
		System.out.println("call 메서드 시작");
		int [] num = new int[2];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3; 	//예외 발생
		System.out.println("call 메서드 종료");
	}
}
//try/catch문으로 예외 처리한 경우
//1. 예외가 발생하면 JVM에게 예외를 던진다. 
//2. JVM은 발생한 예외를 분석한 후 ArrayIndexOutOfBoundsException 객체를 생성한다. 
//3. JVM은 생성된 예외 객체를 발생된 곳으로 던진다. 
//4. JVM이 던져 예외 객체를 catch 블록이 잡는다. 
//5. 예외 처리를 한 후 프로그램이 정상 종료한다.