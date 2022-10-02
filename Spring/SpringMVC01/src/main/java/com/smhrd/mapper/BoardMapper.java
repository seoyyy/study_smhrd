package com.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;

import com.smhrd.domain.Board;

//추상메서드만 가지는 interface로 구현
public interface BoardMapper {

	// 추상메소드
	// 태그해주는 id 와 메서드 이름이 같아야 찾아와줄수있음
	public List<Board> boardList();

	public int boardInsert(Board vo); // result 타입에 들어가는게 메소드의 리턴타입과 같게해준다고보기
	// 여기까지는 우리가 도구만 만든거! 이제 가져다가 사용만하면됌.
	
	public Board boardContent(int idx);  //조건에 맞는 한개만가져오닌까 arrayList로가져오는거아니고 board로 하나만
							//idx를 조건으로 받아야하니 매개인자로 넣어주기

	
	//원래는 이sql구문을 mapper.xml파일에 mapper안에 적어놨는데, 이번엔  annoation안에 적어주거 우리가사용하고자하는 메소드와 바로 매핑해놓는 방법도있음
	//원래방법과 이방법 둘중 하나만 선택해야함 안그러면 오류남         추상메소드<---mapping( 1:1)--> SQL쿼리 가 무조건 일대일로 매칭
	//insert / delete/ update -> int
	// 어노테이션을 이용한 sql문 작성이 가능 
	// 어노테이션 이름 == 사용하고자 하는 문장 이름
	// @Delete("SQL 쿼리")
	@Delete("delete from board where idx=#{idx}")
	public int boardDelete(int idx);
	
	
	public int boardUpdate(Board vo);
}
