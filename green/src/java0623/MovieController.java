package java0623;
import java.awt.List;
//import java.util.List;

//디자인 패턴 중 하나인 MVC 패턴
//디자인 패턴이란 프로그램이나 어떤 특정한 것을 개발하는 중에 발생했던 문제점들을 정리해서
//상황에 따라 간편하게 적용해서 쓸 수 있는 것을 정리하여 특정한 "규약"을 통해
//쉽게 쓸 수 있는 형태로 만든 것을 말한다.
//MVC는 Model, View, Controller 의 약자이다
//하나의 애플리케이션, 프르젝트를 구성할 때 그 구성요소를 세가지의 역할로 구분한 패턴이다. 
//
//컨트롤러 : 데이터와 사용자인터페이스 요소를 잇는
//즉) 모델과 뷰를 이어주는 다리역할을 한다
// 이벤트에 대해서 적당한 모델을 선택한다.  
// **로직은 컨트롤러가 담당한다.
public class MovieController {
	MovieModel model = new MovieModel();

// 리스트에 영화제목을 추가하는 메서드
	public void addTitle(String title, List movieList) {
		try {
// 모델 객체에 addTitle 메서드 실행		
			model.addTitle(title, movieList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// 리스트에 있는 영화 제목을 삭제하는 메서드
	public void delTitle(String title, List movieList) {
// 모델 객체에 delTitle 메서드 실행
		model.delTitle(title, movieList);
	}

// 리스트에 있는 영화제목들을 파일에 저장하는 메서드
	public void saveTitles(List movieList) {
		try {
// 모델 객체에 savaTitles 메서드ㅡ 실행
			model.saveTitles(movieList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
