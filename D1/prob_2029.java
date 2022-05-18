package SW_Expert.D1;
import java.util.Scanner;

public class prob_2029 {

	public static void main(String[] args) {
		// 몫과 나머지 출력하기
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("#"+tc+" "+(a/b)+" "+(a%b));
		}
	}
}
