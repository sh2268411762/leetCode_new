package Java58.book_operation;


import Java58.book.Book;
import Java58.book.BookList;

//显示图书
public class DisOperation implements IOperation
{
    @Override
    public void work(BookList bookList)
    {
        System.out.println("显示图书");
        for (int i = 0; i < bookList.getUseSide(); i++)
        {
            Book book = bookList.getBooks(i);
            System.out.println(book);
        }
        System.out.println("显示完成");
    }
}
