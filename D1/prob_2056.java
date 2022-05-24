package SW_Expert.D1;
import java.util.Scanner;

public class prob_2056 {

	public static void main(String[] args) {
		//연월일 달력
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			String input = sc.next();
			String Year = input.substring(0,4);
			String Month = input.substring(4,6);
			String Day = input.substring(6,8);
			
			int year = Integer.parseInt(Year);
			int month = Integer.parseInt(Month);
			int day = Integer.parseInt(Day);
			if(12<month||month<1) {
				System.out.println("#"+tc+" "+-1);
				continue;
			}else if(month == 4 || month == 6 || month == 9 || month == 11) {
				if(day>30) {
					System.out.println("#"+tc+" "+-1); 
					continue;
				}
				else { 
					System.out.println("#"+tc+" "+Year+"/"+Month+"/"+Day);
				}
					
			}else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 12) {
				if(day>31) {
					System.out.println("#"+tc+" "+-1);
					continue;
				}else {
					System.out.println("#"+tc+" "+Year+"/"+Month+"/"+Day);
				}
			}else if(month==2) {
				if(day>28) {
					System.out.println("#"+tc+" "+-1);
					continue;
				}else {
					System.out.println("#"+tc+" "+Year+"/"+Month+"/"+Day);
				}
			}
		}
	}
}

