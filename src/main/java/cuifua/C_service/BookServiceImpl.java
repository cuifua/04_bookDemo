package cuifua.C_service;

import cuifua.A_domain.Books;
import cuifua.B_dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookDao bookDao;

    @Override
    public int addBook(Books books)
    {
        return bookDao.addBook(books);
    }

    @Override
    public int deleteBook(int id)
    {
        return bookDao.deleteBook(id);
    }

    @Override
    public int updateBook(Books books)
    {
        return bookDao.updateBook(books);
    }

    @Override
    public Books queryBookBYId(int id)
    {
        return bookDao.queryBookBYId(id);
    }

    @Override
    public List<Books> queryAllBook()
    {
        return bookDao.queryAllBook();
    }
}
