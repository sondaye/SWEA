package SW_Expert.D1;
import java.util.Scanner;

public class prob_2043 {

	public static void main(String[] args) {
		// 서랍의 비밀번호
		/*Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int K = sc.nextInt();
		System.out.println(P-K+1);
	}*/
		/*Scanner scan = new Scanner(System.in);
		int P = scan.nextInt();
		int K = scan.nextInt();
		for(int i=0;i<K;i++) {
			if(P==K+i) {
				System.out.println(i+1);
				break;
			}
		}*/
		
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
		int num = K;
		for(int i=0;i<P;i++) {
			num+=i;
			count++;
			if(P==num) {
				System.out.println(count);
				break;
			}
			num=K;
		}
	}
}

