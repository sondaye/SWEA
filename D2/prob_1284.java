package SW_Expert.D2;
import java.util.*;

public class prob_1284 {

	public static void main(String[] args) {
		// 수도요금 경쟁
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			
			int A_value = W*P;
			int B_value = 0;
			if(W>R) {
				B_value = Q + (W-R)*S;
			}else {
				B_value = Q;
			}
			
			int result = (A_value>B_value ? B_value : A_value);
			System.out.println("#"+tc+" "+result);

	}
}
}
