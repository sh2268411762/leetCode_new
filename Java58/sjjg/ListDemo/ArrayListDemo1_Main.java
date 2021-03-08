package Java58.sjjg.ListDemo;

public class ArrayListDemo1_Main
{
    public static void main(String[] args)
    {
        List list = new ArrayListDemo1();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("list = " + list);   //1,2,3,4
        System.out.println("size = " + list.size());//4

        list.add(0, 100);
        System.out.println("list = " + list);//100,1,2,3,4
        System.out.println("size = " + list.size());//5

        list.add(5, 200);
        System.out.println("list = " + list);//100,1,2,3,4,200
        System.out.println("size = " + list.size());//6

        try
        {
            list.add(7, 300);
        } catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        list.remove(3);
        System.out.println("list = " + list);//100,1,2,4,200
        System.out.println("size = " + list.size());//5

        try
        {
            list.remove(-1);
        } catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        try
        {
            list.remove(5);
        } catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        System.out.println(list.remove((Integer) 100));
        System.out.println("list = " + list);//1,2,4,200
        System.out.println("size = " + list.size());//4

        System.out.println(list.remove((Integer) 100));
        System.out.println("list = " + list);//1,2,4,200
        System.out.println("size = " + list.size());//4

        System.out.println(list.get(0));

        try
        {
            list.get(-1);
        } catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        System.out.println(list.set(3, 2000));
        System.out.println("list = " + list);//1,2,4,2000
        System.out.println("size = " + list.size());//4

        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("list = " + list);
        System.out.println("size = " + list.size());//10

        list.add(11);
        System.out.println("list = " + list);
        System.out.println("size = " + list.size());//11

        list.add(1);
        System.out.println("list = " + list);
        System.out.println("size = " + list.size());//12
        System.out.println(list.indexOf(1));        //0
        System.out.println(list.lastIndexOf(1));//11

        System.out.println(list.indexOf(99));//-1
        System.out.println(list.lastIndexOf(99));//-1

        Iterator it = list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
