package SW_Expert.D1;
import java.util.Scanner;

public class prob_1936 {

	public static void main(String[] args) {
		// 1대1 가위바위보
		Scanner sc = new Scanner(System.in);
		int user1 = sc.nextInt();
		int user2 = sc.nextInt();
		if(user1==1) { //A가 가위일 때
			String result = (user2==3)?"A":"B";
			System.out.println(result);
		}else if(user1==2) { // A가 바위일 때
			String result = (user2==1)?"A":"B";
			System.out.println(result);
		
		}else if(user1==3) {
			String result = (user2==2)?"A":"B";
			System.out.println(result);
		}

	}

}
