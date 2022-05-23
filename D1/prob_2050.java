package SW_Expert.D1;
import java.util.Scanner;

public class prob_2050 {

	public static void main(String[] args) {
		// 알파벳을 숫자로 변환
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arry = str.toCharArray();
		for(int i=0;i<arry.length;i++) {
			System.out.print((arry[i] - 'A')+1+" ");
		}
	}

}
