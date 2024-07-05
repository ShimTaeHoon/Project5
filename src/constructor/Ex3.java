package constructor;

public class Ex3 {

	
	
}

// 게시물을 정의하는 클래스
class Board{
	int no;
	String title;
	String content;
	String writer;
	
	public Board(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	// 게시물 번호만 초기화 하는 생성자
	public Board(int no) {
		super();
		this.no = no;
	}

	// 게시물 번호와 게시물을 초기화 하는 생성자
	public Board(int no, String title) {
		super();
		this.no = no;
		this.title = title;
	}

	// 디폴트 생성자 (매개변수가 하나도 없음)
	// 객체만 생성하고 값은 초기화 하지 않는 기본 생성자
	public Board() {
		super();
	}

}