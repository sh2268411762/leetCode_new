package Java40.thread_study.lesson8;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 锁消除：局部变量属于虚拟机栈，线程私有
 * @Date 2021/7/1 17:01
 */
public class test3
{

    //死锁出现的原因：至少两个线程，互相持有对方需要的资源没有释放，再次申请对方已持有的资源
    //出现死锁的后果：线程互相阻塞等待对方的资源，会一直处于阻塞等待的状态
    //检测死锁：jdk工具 --> jcsoncle（查看线程—— --> jstack
    //解决死锁：资源一次性分配（破坏请求与保持条件）
    //          在线程满足条件时，释放掉已占有的资源（一定条件，主动释放资源）
    //          资源有序分配：系统为每类资源赋予一个编号，每个线程按照编号递请求资源，释放则相反
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();

        sb.append("a").append("b").append("c");

        System.out.println(sb);
    }
}
