package baekjoon_onlineStudies;

import java.util.ArrayList;
//#17103
//골드바흐 파티션 : 백만 이하의 짝수N을 두 소수 합으로 나타내는 방법의 수 
import java.util.Scanner;

public class Basic01_ch3_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> primes = new ArrayList<Integer>(); // 소수 배열
		boolean[] check = new boolean[1000001];

		// --- b 구해줌
		for (int i = 2; i <= 1000000; i++) {
			if (check[i] == false) {
				// 소수인 것은 primes에 넣어주기
				primes.add(i);

				// 배수 지워주기
				for (int j = i + i; j <= 1000000; j += i) {
					check[j] = true;
				}
			}
		}

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int ans = 0;

			// --- a 구해줌
			for (int p : primes) {
				// a>=2
				// a>b
				if (n - p >= 2 && p <= n - p) {
					// n = a + b 형태
					// n - b = a 구하기
					if (check[n - p] == false) {
						ans += 1;
					}
				} else {
					break;
				}
			}
			System.out.println(ans);
		}

	}
}
