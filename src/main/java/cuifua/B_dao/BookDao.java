package cuifua.B_dao;

import cuifua.A_domain.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao
{
    int addBook(Books books);
    int deleteBook(@Param("bookID") int id);
    int updateBook(Books books);
    Books queryBookBYId(@Param("bookID") int id);
    List<Books> queryAllBook();
}
