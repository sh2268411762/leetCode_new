package Java58.map;

import java.util.Map;


/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/2 下午 16:26
 */
public class mapTest
{
    public static void main(String[] args)
    {
        MyTreeMap mailList = new MyTreeMap();
        mailList.put("ss", 888);

        //put 方法返回插入之前该 key 映射的值
        Integer v = mailList.put("sh", 123);
        System.out.println(v);
        System.out.println(mailList);
        v = mailList.put("sh", 456);
        System.out.println(v);
        System.out.println(mailList);
        System.out.println();

        /* get 获取某 key 对应的值，如果没有该 key ，返回null */
        v = mailList.get("sh");
        System.out.println(v);
        v = mailList.get("sh");
        System.out.println(v);
        v = mailList.get("jj");
        System.out.println(v);
        System.out.println();

        //getOrDefault(key value) 获取某 key 对应的值，如果没有该 key ，返回默认的 value
        //不会修改集合本身
        System.out.println(mailList);
        v = mailList.getOrDefault("jj", -1);
        System.out.println(v);
        System.out.println(mailList);
        System.out.println();

    }
}
