package SW_Expert.D1;
import java.util.Scanner;

public class prob_2019 {

	public static void main(String[] args) {
		// 더블더블
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=1;
		System.out.print(sum+" ");
		for(int i=0;i<num;i++) {
			sum = sum*2;
			System.out.print(sum+" ");
		}
	}
}
