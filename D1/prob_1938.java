package SW_Expert.D1;
import java.util.Scanner;

public class prob_1938 {

	public static void main(String[] args) {
		// 아주 간단한 계산기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println((int)(a/b));
	}
}
