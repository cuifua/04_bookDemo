import cuifua.A_domain.Books;
import cuifua.B_dao.BookDao;
import cuifua.C_service.BookService;
import cuifua.C_service.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01
{
    public static void main(String[] args)
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService =(BookService) ctx.getBean(BookService.class);

        Books books = new Books(1008,"资本论",99,"马克思对于阶级的观察与剖析");
        Integer i = bookService.addBook(books);
        System.out.println(i);
    }
}
