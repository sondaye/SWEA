package SW_Expert.D1;
import java.util.Scanner;

public class prob_2068 {

	public static void main(String[] args) {
		// 최대수 구하기
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arry[] = new int[10];
		for(int tc=1;tc<=T;tc++) {
			int max = 0;
			for(int i=0;i<10;i++) {
				arry[i] = sc.nextInt();
				if(max<arry[i]) {
					max = arry[i];
				}
			}
			System.out.println("#"+tc+" "+max);
		}
	}
}

