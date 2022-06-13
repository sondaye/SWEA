package SW_Expert.D2;
import java.util.*;

public class prob_1288 {

	public static void main(String[] args) {
		// 새로운 불면증 치료법
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			String a = sc.next();
			int N = Integer.parseInt(a);
	
		boolean[] check = new boolean[10]; // 1부터 10까지 다 봤는지 확인
		int cnt = 0;
		int k = 1; // 곱해줄 수
		
		while(true) {
			for(int i=0;i<a.length();i++) {
				int temp = Integer.parseInt(a.substring(i,i+1)); // 한글자씩 숫자로 변환
				if(check[temp]==false) { // check배열에 해당 숫자가 없으면
					check[temp] = true; // true로 바꾸고
					cnt++; // 카운트 증가
				}
			}
			if(cnt==10) break; // 10까지 다 봤으면 끝
			else {
				k++; // 아니면 곱하는 값을 증가
				a = Integer.toString(k*N); // k*숫자
			}

		}
		System.out.println("#"+tc+" "+a);

		}
	}
}
