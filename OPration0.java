package p1;

import java.util.Random;

public class OPration0 {
	public static void main(String[] args) {
		printHeader();
		printExandAn();
	}
	public static void printHeader() { 
		System.out.println("******�õ�һ��50���⼰��********");
	}
	public static void printExandAn() {
		int a = 0, b = 0, ac = 0;
		char p = '+';
		int s[] = new int[100];
		Random ran = new Random();
		System.out.println("ϰ�����£�");
		for (int i = 0; i < 50; i++) {
			a = ran.nextInt(101);
			b = ran.nextInt(101);
			ac = ran.nextInt(2);
			if (ac == 1) {
				p = '+';
				s[i] = a + b;
			} else {
				p = '-';
				s[i] = a - b;
			}
			System.out.println((i + 1) + ":" + a + p + b + "= ");
		}
		System.out.println("�����£�");
		for (int i = 0; i < 50; i++) {
			System.out.println((i + 1) + ": " + s[i]);
		}
	}
}
