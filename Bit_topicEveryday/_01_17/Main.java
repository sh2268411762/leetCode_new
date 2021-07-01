package Bit_topicEveryday._01_17;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(sc.hasNext())
        {
            int length = sc.nextInt();
            int temp = sc.nextInt();

            List<Stu> list = new ArrayList<Stu>();
            for (int i = 0; i < length; i++) {
                String name = sc.next();
                int grade = sc.nextInt();
                list.add(new Stu(name, grade));
            }

            if (0 == temp) {
                list.sort(new Comparator<Stu>()
                {
                    @Override
                    public int compare(Stu o1, Stu o2)
                    {
                        return o2.grade - o1.grade;
                    }
                });
            } else if (1 == temp) {
                list.sort(new Comparator<Stu>()
                {
                    @Override
                    public int compare(Stu o1, Stu o2)
                    {
                        return o1.grade - o2.grade;
                    }
                });
            }

            for (Stu stu : list)
            {
                System.out.println(stu.name + " " + stu.grade);
            }
        }
    }
}

class Stu {
    public String name;
    public int grade;

    public Stu(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

