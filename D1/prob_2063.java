package SW_Expert.D1;
import java.util.Arrays;
import java.util.Scanner;

public class prob_2063 {

	public static void main(String[] args) {
		// 중간값 찾기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arry = new int[6+1];
		for (int i=0;i<N;i++) {
			arry[i]=sc.nextInt();
		}
		
		Arrays.sort(arry);
		
		System.out.println(arry[0]);	
		System.out.println(arry[1]);	
		System.out.println(arry[2]);	
		System.out.println(arry[3]);	
		System.out.println(arry[4]);	
		System.out.println(arry[5]);	
		System.out.println(arry[6]);	

	}

}
