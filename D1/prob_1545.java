package SW_Expert.D1;
import java.util.Scanner;

public class prob_1545 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int num = T;
		for(int tc=0;tc<=T;tc++) {
			System.out.print(num+" ");
			num = num - 1;
		}
	}
}


