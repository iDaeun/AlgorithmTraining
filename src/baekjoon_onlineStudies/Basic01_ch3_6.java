package baekjoon_onlineStudies;
//팩토리얼 0의 개수 세기 
//N! = 1*2*3*4*...N

import java.util.Scanner;

public class Basic01_ch3_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		
		// 0이 들어가려면 2*5여야함 ---> 소인수분해해서 알아보기
		// 2의 개수는 항상 5보다 많으니 5의 개수만 세어주면 됨
		// n / 5의 배수
		for (int i = 5; i <= n; i *= 5) {
			ans += n / i;
		}
		System.out.println(ans);
	}
}
