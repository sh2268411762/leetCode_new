package Java58.book;

public class BookList
{
    private Book[] books = new Book[10];
    private int useSide;


    public BookList()
    {
        books[0] = new Book("三国演义", "罗贯中", 24, "小说");
        books[1] = new Book("西游记", "吴承恩", 15, "小说");
        books[2] = new Book("水浒传", "施耐庵", 34, "小说");
        books[3] = new Book("红楼梦", "曹雪芹", 29, "小说");
        this.useSide = 4;
    }

    public Book getBooks(int pos)
    {
        return this.books[pos];
    }

    public void setBook(int pos, Book book)
    {
        this.books[pos] = book;
    }

    public int getUseSide() //获取图书数目
    {
        return useSide;
    }

    public void setUseSide(int useSide)
    {
        this.useSide = useSide;
    }
}
