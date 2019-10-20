package baekjoon_onlineStudies;
//소수 몇개인지 찾기

import java.util.Scanner;

public class Basic01_ch3_3 {

	public static boolean is_prime(int x) {
		
		// x가 소수가 되려면
		// 2보다 크거나 같고
		if (x < 2) {
			return false;
		}
//		if (x <= 1) {
//            return false;
//        } else if (x == 2) {
//            return true;
//        }
		
		// 루트x보다 작거나 같은 자연수로 나누어 떨어지면 안됨
		for (int i = 2; i * i <= x; i++) {
			if (x % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		
		while (n-- > 0) {
			if(is_prime(sc.nextInt())) {
				ans+=1;
			}
		}
		System.out.println(ans);
	}
}
