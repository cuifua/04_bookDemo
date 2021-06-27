package cuifua.D_controller;
import cuifua.A_domain.Books;
import cuifua.C_service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController
{
    //调service
    @Autowired
    private BookService bookService ;

    //查询全部的书籍，并且返回到书籍的展示页面
    @RequestMapping("/allBook")
    public String list(Model model)
    {
        List<Books> lists=bookService.queryAllBook();
        model.addAttribute("list",lists);
        return "allBook";
    }

    //跳转到增加数据页面
    @RequestMapping("/toAddBook")
    public String toAddPaper()
    {
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books)
    {
        bookService.addBook(books);
        return "redirect:/book/allBook";//重定向到@RequestMapping（"allBook"）请求
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id)
    {
        Books books = bookService.queryBookBYId(id);
        System.out.println(books);
        model.addAttribute("book",books );
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Model model, Books book)
    {
        System.out.println(book);
        bookService.updateBook(book);
        Books books = bookService.queryBookBYId(book.getBookID());
        model.addAttribute("books", books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/del/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id)
    {
        bookService.deleteBook(id);
        return "redirect:/book/allBook";
    }
}

