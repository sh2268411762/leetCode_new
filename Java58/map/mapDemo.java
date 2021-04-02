package Java58.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author ���廴��
 * @version 1.0
 * @Description map ��ʹ��
 * @Date 2021/4/2 ���� 15:57
 */
public class mapDemo
{
    public static void main(String[] args)
    {
        Map<String, Integer> mailList = new TreeMap<>();

        mailList.put("��", 119);
        mailList.put("����", 110);
        mailList.put("����", 114);
        mailList.put("���", 114);

        //�������� key��set ���Զ�ȥ��
        Set<String> keys = mailList.keySet();
        System.out.println(keys + "\n");

        //�������� value
        Collection<Integer> values = mailList.values();
        System.out.println(values + "\n");

        //���ؼ�ֵ��
        Set<Map.Entry<String, Integer>> entries = mailList.entrySet();
        System.out.println(entries + "\n");

        //�Ƿ��и� key
        boolean flag = mailList.containsKey("��");
        System.out.println(flag);
        flag = mailList.containsKey("�˾�");
        System.out.println(flag + "\n");

        //�Ƿ��и� value
        flag = mailList.containsValue(114);
        System.out.println(flag);
        flag = mailList.containsValue(222);
        System.out.println(flag);
    }

    public static void main1(String[] args)
    {
        Map<String, Integer> mailList = new TreeMap<>();
        mailList.put("ss", 888);

        //put �������ز���֮ǰ�� key ӳ���ֵ
        Integer v = mailList.put("sh", 123);
        System.out.println(v);
        System.out.println(mailList);
        v = mailList.put("sh", 456);
        System.out.println(v);
        System.out.println(mailList);
        System.out.println();

        //get ��ȡĳ key ��Ӧ��ֵ�����û�и� key ������null
        v = mailList.get("sh");
        System.out.println(v);
        v = mailList.get("sh");
        System.out.println(v);
        v = mailList.get("jj");
        System.out.println(v);
        System.out.println();

        //getOrDefault(key value) ��ȡĳ key ��Ӧ��ֵ�����û�и� key ������Ĭ�ϵ� value
        //�����޸ļ��ϱ���
        System.out.println(mailList);
        v = mailList.getOrDefault("jj", -1);
        System.out.println(v);
        System.out.println(mailList);
        System.out.println();

        //remove��key�� ɾ��key - value ӳ���ϵ������value,û�� key �򷵻� null
        v = mailList.remove("sh");
        System.out.println(v);
        System.out.println(mailList);
        System.out.println();


    }
}
