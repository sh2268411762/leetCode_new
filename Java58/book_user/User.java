package Java58.book_user;

import Java58.book.BookList;
import Java58.book_operation.IOperation;

public abstract class User
{
    protected String name;
    IOperation[] iOperations;

    public User(String name)
    {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList)
    {
        this.iOperations[choice].work(bookList);
    }

}
