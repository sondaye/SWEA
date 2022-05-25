package SW_Expert.D1;
import java.util.Scanner;

public class prob_2058 {

	public static void main(String[] args) {
		// 자릿수 더하기 5678 -> 5+6+7+8 = 26
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = num/1000;
		int num2 = (num%1000)/100;
		int num3 = (num%100)/10;
		int num4 = num%10;
		int sum = num1+num2+num3+num4;

		System.out.println(sum);
		
	}

}
