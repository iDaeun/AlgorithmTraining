package baekjoon_onlineStudies;
//주어진 범위 안 소수 몇개인지 찾기
//**골드바흐의 추측 : 2보다 큰 모든 짝수는 두 소수의 합으로 표현 가능하다  - 5보다 큰 모든 홀수는 세 소수의 합으로 표현 가능하다 (백만 이하)
//-> 에라토스테네스의 체 사용
//n = a(홀수소수) + b(홀수소수)
//n - b = 소수 ? --> check[n-b]==false임을 확인해야함

import java.util.ArrayList;
import java.util.Scanner;

public class Basic01_ch3_5 {

	private static final int MAX = 1000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] check = new boolean[MAX + 1];

		ArrayList<Integer> prime = new ArrayList<Integer>();
		check[0] = check[1] = true;

		for (int i = 2; i * i <= MAX; i++) {
			if (check[i] == true) {
				continue;
			}
			prime.add(i); // false인 것(소수)만 담기
			for (int j = i + i; j <= MAX; j += i) {
				check[j] = true;
			}
		}

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			for (int i = 1; i < prime.size(); i++) {
				int p = prime.get(i);
				
				// n = a + b 형태
				// n - b = a 구하기
				if (check[n - p] == false) {
					System.out.println(n + " = " + p + " + " + (n - p));
					break;
				}
			}
		}
	}
}
