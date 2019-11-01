package baekjoon_onlineStudies;

import java.util.Arrays;
import java.util.Scanner;

// #2309
// 브루트포스
// 일곱 난쟁이 
public class Basic02_ch1_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 9;
		int[] a = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); // 난쟁이의 키 입력받기
			sum += a[i]; // 모든 키 더하기
		}

		Arrays.sort(a); // 오름차순으로 정렬

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				// 두 명의 난쟁이 키 얻기

				if (sum - a[i] - a[j] == 100) {
					// a[i]와 a[j]는 난쟁이가 아닌 경우임 
					
					for (int k = 0; k < n; k++) {
						if (i == k || j == k)
							continue; // 난쟁이가 아닌 a[i]와 a[j]는 빼고
						System.out.println(a[k]); // -> 출력하기!
					}
					System.exit(0); // "가능한 정답이 여러가지면 하나만 출력하고 프로그램 종료!"
				}

			}
		}

	}

}
