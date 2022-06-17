package SW_Expert.D2;
import java.util.Scanner;

public class prob_1945 {

	public static void main(String[] args) {
		// 간단한 소인수분해
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int a=0,b=0,c=0,d=0,e=0;
			while(true) {
			if(N%2==0) {
				N = N/2;
				a++;
			}
			else if(N%3==0) {
				N = N/3;
				b++;
			}else if (N%5==0) {
				N = N/5;
				c++;
			}else if (N%7==0) {
				N = N/7;
				d++;
			}else if (N%11==0) {
				N = N/11;
				e++;
			}

			if(N==1) break;
			}
			
			System.out.println("#"+tc+" "+a+" "+b+" "+c+" "+d+" "+e);
		}
	}

}
