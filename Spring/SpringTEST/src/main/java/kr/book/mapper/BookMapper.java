package kr.book.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Repository;

import kr.book.domain.Book;

@Repository
public interface BookMapper {
	
	
	
	public List<Book> bookList();
	
	
	public int bookInsert(Book vo);
	
}
