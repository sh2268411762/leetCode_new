package Bit_topicEveryday._11_25;


class Base{
    public Base(String s){
        System.out.print("B");
    }
}
public class Test extends Base{
    public Test (String s) {
        super(s);
        System.out.print("D");
    } public static void main(String[] args){
        new Test("C");
    }
}

