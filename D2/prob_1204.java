package SW_Expert.D2;
import java.util.Scanner;

public class prob_1204 {

	public static void main(String[] args) {
		// 최빈수 구하기
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int caseNum = sc.nextInt(); // 첫 줄에 caseNum이 주어짐
			int[] scores = new int[101]; // 점수 범위가 0~100 까지이므로 101개
			
			for(int i=0;i<1000;i++) {
				int num = sc.nextInt();
				scores[num] = scores[num]+1;
			}

			int max = 0;
			int result = 0;
			for(int i=0;i<scores.length;i++) {
				if(scores[i]>=max) {
					max = scores[i]; 
					result = i; // 인덱스=점수 이므로 인덱스를 결과값으로 받아야 한다.
				}
			}
			System.out.println("#"+caseNum+" "+result);
		}
	}
}
