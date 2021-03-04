package Java58.string;

//自定义异常
public class Test2
{
    private static String userName = "admin";
    private static String password = "123456";

    public static void main(String[] args)
    {
        login("admin", "123456");
        login("admin1", "123456");
        login("admin", "1234567");
    }

    public static void login(String userName, String password)
    {
        if (!Test2.userName.equals(userName))
        {
            System.out.println("用户名错误");
            return;
            // TODO 处理用户名错误
        }
        if (!Test2.password.equals(password))
        {
            System.out.println("密码错误");
            return ;
            // TODO 处理密码错误
        }
        System.out.println("登陆成功");
    }
}

