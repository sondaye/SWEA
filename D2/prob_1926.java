package SW_Expert.D2;
import java.util.Scanner;

public class prob_1926 {

	public static void main(String[] args) {
		// 간단한 369 게임
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i=1;i<=count;i++) {
			if(i==3||i==6||i==9){
				System.out.print("- ");
			}else if((i%10==3||i%10==6||i%10==9)
					&& (i/10==3||i/10==6||i/10==9)){
				System.out.print("-- ");
			}else if((i%10==3||i%10==6||i%10==9)||
					(i/10==3||i/10==6||i/10==9)){
				System.out.print("- ");
			}else System.out.print(i+" ");	
		}
	}
}
