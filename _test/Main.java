package _test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int month = sc.nextInt();
			System.out.println(Main.getNumber(month));
		}
		sc.close();
	}

	private static int getNumber(int month) {
		// TODO 自动生成的方法存根
		if(1 == month || 2 == month)
		{
			return 1;
		}
		return getNumber(month - 1) + getNumber(month - 2);
	}
}
