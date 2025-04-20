package objects;

public class Book {
	int bookNumber; //책번호
	String bookTitle; //책제목
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	@Override
	public boolean equals(Object obj) {
		//instanceof - 클래스의 객체(인스턴스)인지 확인 사용
		if(obj instanceof Book ) {
			Book book = (Book)obj;
			if(this.bookNumber == book.bookNumber)
				return true;
		}
		
		
		return false;
	}
	
	
		
	

}
