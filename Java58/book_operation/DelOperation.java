package Java58.book_operation;


import Java58.book.Book;
import Java58.book.BookList;

import java.util.Scanner;

//删除图书
public class DelOperation implements IOperation
{
    @Override
    public void work(BookList bookList)
    {
        System.out.println("删除图书");
        System.out.println("请输入图书的名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int pos = -1;

        int i = 0;
        for (; i < bookList.getUseSide(); i++)
        {
            Book book = bookList.getBooks(i);

            if (book.getName().equals(name))
            {
                System.out.println("找到了《" + name + "》");
                pos = i;
                break;
            }
        }
        if (i >= bookList.getUseSide())
        {
            System.out.println("没有《" + name + "》这本书");
            return;
        }

        int curSide = bookList.getUseSide();
        for (int j = pos; j < bookList.getUseSide() - 1; j++)
        {
            bookList.setBook(i, bookList.getBooks(i + 1));
        }
        bookList.setUseSide(curSide - 1);
        System.out.println("删除成功！");
    }
}
