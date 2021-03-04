package Java58.string;


class UserError extends Exception {
    public UserError(String message) {
        super(message);
    }
}
class PasswordError extends Exception {
    public PasswordError(String message) {
        super(message);
    }
}

public class Test3
{
    private static final String userName = "admin";
    private static final String password = "123456";


    public static void main(String[] args) {
        try {
            login("admin", "123456");
            //login("admin1", "123456");
            //login("admin", "1234567");
        } catch (UserError userError) {
            userError.printStackTrace();
        } catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        }
    }
    public static void login(String userName, String password) throws UserError,
            PasswordError {
        if (!Test3.userName.equals(userName)) {
            throw new UserError("用户名错误");
        }
        if (!Test3.password.equals(password)) {
            throw new PasswordError("密码错误");
        }
        System.out.println("登陆成功");
    }
}
