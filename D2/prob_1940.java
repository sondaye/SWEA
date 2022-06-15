package SW_Expert.D2;
import java.util.*;

public class prob_1940 {

	public static void main(String[] args) {
		// 가랏! RC카!
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=1;tc++) {
            int N = sc.nextInt();
            int a, v = 0, d = 0;
            for(int n=0; n<N; n++) {
                int command = sc.nextInt();
                if( command != 0 ) {
                    a = sc.nextInt();
                    if( command == 1 ) v += a;
                    else {
                        v -= a;
                        if( v<0 ) v=0;
                    }
                }
                d += v;
            }
            System.out.format( "#%d %d\n", tc, d );
        }
    }
}