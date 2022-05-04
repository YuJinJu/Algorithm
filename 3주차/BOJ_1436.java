import java.util.*;
public class BOJ_1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String num = "666"; //666부터 검사
		int cnt = 0;
		
		while(n > 0) {
			if (num.contains("666")) { //666을 포함하면 n 감소
				n--;
				
				if (n == 0) break; //n이 0이면 while문 빠져나옴
			}

			int nums = Integer.parseInt(num) + 1;
			num = Integer.toString(nums);
		}
		
		System.out.println(num);
	}

	
}
