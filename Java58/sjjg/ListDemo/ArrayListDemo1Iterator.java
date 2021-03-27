package Java58.sjjg.ListDemo;

public class ArrayListDemo1Iterator implements Iterator
{
    private ArrayListDemo1 list;    //要遍历的顺序表
    private int index;              //下标

    public ArrayListDemo1Iterator(ArrayListDemo1 list)
    {
        this.list = list;
        index = 0;
    }

    @Override
    public boolean hasNext()
    {
        return index < list.size();
    }

    //1、返回迭代器当前位置
    //2、迭代器++
    @Override
    public Integer next()
    {
        return list.get(index++);
    }

    @Override
    public void remove()
    {

    }
}
