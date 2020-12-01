package Bit_topicEveryday._12_01;

public class Test {
    static int cnt = 6;

    static {
        cnt += 9;
    }

    public static void main(String[] args) {
        System.out.println(new B().getValue());
    }

    static class A
    {
        private int value;

        public A(int v)
        {setValue(v);}

        public void setValue(int value)
        {
            this.value = value;
        }
        public int getValue()
        {
            try{
                value++;
                return value;
            }catch(Exception e)
            {
                System.out.println(e.toString());
            }
            finally{
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }

    static class B extends A{
        public B()
        {
            super(5);
            setValue(getValue()-3);
        }
        public void setValue(int value)
        {
            super.setValue(2 * value);
        }


    }


    public static void main1(String[] args) {
//        System.out.println("cnt = " + cnt);
        double x = 3.0;
        int y = 5;
        x /= --y;
        System.out.println(x);
    }

    static {
        cnt /= 3;
    }
}
