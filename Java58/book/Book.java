package Java58.book;

public class Book
{
    public String name;        //图书名
    public String author;      //图书作者
    public int price;          //图书价格
    public String type;        //图书类型
    public boolean isBorrowed; //是否被借出


    public Book(String name, String author, int price, String type)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public boolean isBorrowed()
    {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed)
    {
        isBorrowed = borrowed;
    }


    @Override
    public String toString()
    {
        return "Bool{" +
                "书名='" + name + '\'' +
                ", 作者='" + author + '\'' +
                ", 价格=" + price +
                ", 类型='" + type + '\'' +
                ", 出借=" + isBorrowed +
                '}';
    }
}
