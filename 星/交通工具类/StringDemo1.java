package 星.交通工具类;

public class StringDemo1 {
    public static void main(String[] args) {
        String str = new String("abc123def456");
        int num1 = Integer.parseInt(str.substring(3,6));
        System.out.println(num1);
    }
}
