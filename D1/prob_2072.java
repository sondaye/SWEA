package SW_Expert.D1;
import java.util.Scanner;

public class prob_2072 {

	public static void main(String[] args) {
//		홀수만 더하기
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt(); // 3
		for(int tc=1;tc<=T;tc++) { 
			int sum = 0;
			for(int i=0;i<10;i++) {
				int num = sc.nextInt();
				if(num%2==1) {
					sum +=num;
				}
			}
			System.out.printf("#%d %d\n",tc,sum);
		}

	}
	/*
	 import java.util.*;
public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int T = sc.nextInt();
        for( int tc=1; tc<=T; tc++ ) {
            int sum = 0;
            for( int j=0; j<10; j++ ) {
             	int n = sc.nextInt();
                if( n%2 == 1 ) sum+=n;
            }
            System.out.format("#%d %d\n", tc, sum);
        }
    }
}
	 */

}
