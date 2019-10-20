package baekjoon_onlineStudies;
//주어진 범위 안 소수 몇개인지 찾기

//**에라토스테네스의 체

import java.util.Scanner;

public class Basic01_ch3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// n이상 m이하의 소수 출력
		int n = sc.nextInt(); // 3
		int m = sc.nextInt(); // 16

		// 소수 저장하는 배열 default = false
		// 소수이면 --> false / 소수 아니면(지워지면) --> true
		boolean[] check = new boolean[m + 1]; // boolean[17]
		check[0] = check[1] = true; // 0,1는 지우기 , 소수는 2부터 시작이기 때문

		// 제일 작은 소수 == 2 부터 시작 i++
		// 루트m보다 작거나 같은 수까지
		for (int i = 2; i * i <= m; i++) {
			if (check[i] == true) {
				continue;
			}
			// 배수 지우기
			// i+i부터 시작 ~ m까지
			// i=2이면 2*2, 2*3, 2*4 ... 배수 지우는 것임
			for (int j = i + i; j < m; j += i) {
				check[j] = true;
			}
		}

		// 소수배열에서 3~16사이 소수 구하기
		for (int i = n; i <= m; i++) {
			if (check[i] == false) {
				System.out.println(i);
			}
		}
	}
}
