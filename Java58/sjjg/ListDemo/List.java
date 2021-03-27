package Java58.sjjg.ListDemo;

//int 类型的 List 实现
//int 用作下标。Integer 用于元素
public interface List extends Iterable
{
    boolean add(Integer e);
    void add(int index,Integer e);

    //根据下标删除
    Integer remove(int index);
    //删除第一个遇到的
    boolean remove(Integer element);

    Integer get(int index);
    Integer set(int dex,Integer e);

    int size();
    void clear();
    boolean isEmpty();

    boolean contains(Integer e);
    int indexOf(Integer e);
    int lastIndexOf(Integer e);
}
