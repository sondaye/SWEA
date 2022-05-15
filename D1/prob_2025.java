package SW_Expert.D1;
import java.util.Scanner;

public class prob_2025 {

	public static void main(String[] args) {
		// N줄 덧셈
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
