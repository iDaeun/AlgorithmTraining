package baekjoon_onlineStudies;

//#1463
//1로 만들기(연산 사용하는 횟수의 최솟값) - Top-down
import java.util.Scanner;

//정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
//---
//X가 3으로 나누어 떨어지면, 3으로 나눈다.
//X가 2로 나누어 떨어지면, 2로 나눈다.
//1을 뺀다.

public class Basic01_ch4_1 {
	
	public static int[] d; // d[n] = n을 1로 만드는 최소 연산 횟수

	public static int go(int n) {
		
		// 가장 작은 문제 : 1을1로 만드는 것 = 0번
		if (n == 1) {
			return 0;
		}
		
		// -- 메모이제이션
		if (d[n] > 0) {
			return d[n];
		}
		
		// n-1 = n-> n-1 ~~~ 1 -> (1번 + d[n-1])
		d[n] = go(n - 1) + 1;
		System.out.println("01 "+d[n]);
		
		// n/2 = n-> n/2 ~~~ 1 -> (1번 + d[n/2])
		if (n % 2 == 0) {
			int temp = go(n / 2) + 1;
			System.out.println("02 "+temp);
			if (d[n] > temp) {
				d[n] = temp;
				System.out.println("03 "+d[n]);
			}
		}
		
		// n/3 = n-> n/3 ~~~ 1 -> (1번 + d[n/3]) 
		// n%3==0 = 1번 + d[n/3]번 이라는 뜻
		if (n % 3 == 0) {
			int temp = go(n / 3) + 1;
			System.out.println("04 "+temp);
			if (d[n] > temp) {
				d[n] = temp;
				System.out.println("05 "+d[n]);
			}
		}
		System.out.println("06 "+d[n]);
		return d[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		d = new int[n+1];
		
		System.out.println(go(n));
	}
}
