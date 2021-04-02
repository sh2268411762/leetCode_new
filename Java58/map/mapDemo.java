package Java58.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description map 的使用
 * @Date 2021/4/2 下午 15:57
 */
public class mapDemo
{
    public static void main(String[] args)
    {
        Map<String, Integer> mailList = new TreeMap<>();

        mailList.put("火警", 119);
        mailList.put("警察", 110);
        mailList.put("天气", 114);
        mailList.put("查号", 114);

        //返回所有 key，set 会自动去重
        Set<String> keys = mailList.keySet();
        System.out.println(keys + "\n");

        //返回所有 value
        Collection<Integer> values = mailList.values();
        System.out.println(values + "\n");

        //返回键值对
        Set<Map.Entry<String, Integer>> entries = mailList.entrySet();
        System.out.println(entries + "\n");

        //是否含有该 key
        boolean flag = mailList.containsKey("火警");
        System.out.println(flag);
        flag = mailList.containsKey("匪警");
        System.out.println(flag + "\n");

        //是否含有该 value
        flag = mailList.containsValue(114);
        System.out.println(flag);
        flag = mailList.containsValue(222);
        System.out.println(flag);
    }

    public static void main1(String[] args)
    {
        Map<String, Integer> mailList = new TreeMap<>();
        mailList.put("ss", 888);

        //put 方法返回插入之前该 key 映射的值
        Integer v = mailList.put("sh", 123);
        System.out.println(v);
        System.out.println(mailList);
        v = mailList.put("sh", 456);
        System.out.println(v);
        System.out.println(mailList);
        System.out.println();

        //get 获取某 key 对应的值，如果没有该 key ，返回null
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

        //remove（key） 删除key - value 映射关系，返回value,没有 key 则返回 null
        v = mailList.remove("sh");
        System.out.println(v);
        System.out.println(mailList);
        System.out.println();


    }
}
