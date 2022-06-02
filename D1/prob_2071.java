package SW_Expert.D1;
import java.util.*;

public class prob_2071 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			double sum=0;
			int cnt=0;
			for(int i=0;i<10;i++) {
				double num = sc.nextInt();
				sum += num;
				cnt++;
			}
			System.out.println(cnt);
			double avg = Math.round(sum/cnt);
			System.out.println("#"+tc+" "+(int)avg);
		}
			
	}
}
