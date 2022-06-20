package SW_Expert.D2;
import java.util.Scanner;
import java.util.StringTokenizer;

public class prob_1946 {

	public static void main(String[] args) {
		// 간단한 압축풀기
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {

			int n = sc.nextInt();
			String[] s = new String[n]; //알파벳을 저장
			int[] num = new int[n]; // 알파벳 개수를 저장


			for(int i=0; i<n; i++) {
				s[i] = sc.next();
				num[i] = sc.nextInt();
			}


			System.out.println("#"+tc);
			int cnt=0; // 출력 횟수
			for(int i=0; i<n; i++) {
				for(int j=0; j<num[i]; j++) {
					System.out.print(s[i]);
					cnt++;
					if(cnt == 10) {
						System.out.println();
						cnt = 0;
					}
				}

			}
			System.out.println();

		}
	}

}
