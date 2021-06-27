package cuifua.C_service;

import cuifua.A_domain.Books;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService
{
    int addBook(Books books);
    int deleteBook(int id);
    int updateBook(Books books);
    Books queryBookBYId(int id);
    List<Books> queryAllBook();
}
