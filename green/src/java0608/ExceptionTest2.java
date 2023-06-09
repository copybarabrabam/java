package java0608;
//throw 처리 방식
//예외 발생 시 발생한 예외를 메서드를 호출한 곳으로 전달하여 예외 처리를 한다. 
//-최초 메서드를 호출한 main() 메서드에서는 try/catch문으로 예외 처리를 해야 한다. 
//-RuntimeException 계열은 throws할 필요가 없다.
public class ExceptionTest2 {
	public static void main(String[] args) {
		try { // 정상일 경우
			int[] num = new int[2];
			num[0] = 1;
			num[1] = 2;
			num[2] = 3; // 예외 발생
			System.out.println("Hello");
		} catch (ArrayIndexOutOfBoundsException e) {// 예외가 발생할 경우
			System.out.println("ArrayIndexOutOfBoundsException 오류 발생");
		} finally { // 무조건 하기 때문에 생략이 가능
			System.out.println("오류 발생 유무와 무관하게 반드시 수행된다 ");
		}
		System.out.println("World");
	}
}
