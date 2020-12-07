package Bit_topicEveryday._12_06;

public class test {
    public static void main(String[] args) {
        int x = 20,y = 30;
        boolean b;
        b = x>50 && y > 60 || x>50&&y <-60||x<-50&&y>60||x<-50&&x<-60;
        System.out.println(b);
    }

    static boolean out(char c) {
        System.out.println(c);
        return true;
    }

    public static void main2(String[] args) {
        int i = 0;
        for (out('A'); out('B') && (i < 2); out('C')) {
            i++;
            out('D');
        }
    }

    public static void main1(String[] args) {
        Thread t = new Thread() {
            public void run() {
                dianping();
            }
        };
        t.run();
        System.out.println("dazhong");

    }

    static void dianping() {
        System.out.println("dainping");
    }
}
