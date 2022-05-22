package SW_Expert.D1;
import java.util.Scanner;

public class prob_2047 {

	public static void main(String[] args) {
		// 신문 헤드라인: 소문자를 전부 대문자로 바꿔서 출력
		/*char a = 'a';
		char z = 'z';
		char A = 'A';
		char Z = 'Z';
		System.out.println((int)a+" "+(int)z);
		System.out.println((int)A+" "+(int)Z);
		// 소문자와 대문자는 -32 차이가 난다.*/
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arry = str.toCharArray();
		for(int i=0;i<arry.length;i++) {
			if('A'<= arry[i] && arry[i]<='Z') {
				System.out.print(arry[i]);
			}else if(arry[i] >= 'a' && arry[i]<='z') {
				arry[i] = (char)(arry[i]-('a'-'A'));
				System.out.print(arry[i]);
			}else if(arry[i]=='_') {
				System.out.print('_');
			}else if(arry[i]=='.') {
				System.out.println('.');
			}else if(arry[i]=='\n') {
				break;
			}
		}
	}
}
