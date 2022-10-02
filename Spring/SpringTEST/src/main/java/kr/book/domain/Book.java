package kr.book.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data  //기본 메서드(Getter/Setter/toString)생성
@AllArgsConstructor // 모든 필드를 요소로 갖는 생성자 생성
@NoArgsConstructor //기본생성자(요소 안가지고있는)
@RequiredArgsConstructor//필요한 필드만 요소로 갖는 생성자 생성  - 그리고 각필드에 annotation달아주면됨
public class Book {
	//VO클래스
	

	
		
		
		// 약속 1. VO의 필드(변수) 이름 == Table의 컬럼명
		// 약속 2. 반! 드! 시!  기본생성자는 있어야한다. ( @NoArgsConstructor) 
		
		private int num;  //번호
		@NonNull
		private String title;  // 제목
		@NonNull
		private String author;  //작가
		@NonNull
		private String company; //출판사
		@NonNull
		private String isbn; //ISBN
		@NonNull
		private int count; //보유도서수
		
		
		

	}

