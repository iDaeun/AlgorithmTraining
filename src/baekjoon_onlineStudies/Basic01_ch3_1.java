package baekjoon_onlineStudies;
//최대공약수 & 최소공배수 구하기

import java.util.Scanner;

public class Basic01_ch3_1 {

	// 최대공약수 : 공통된 약수 중에서 가장 큰 정수
	// **유클리드 호제법 사용
	// a%b=r : GCD(a,b) = GCD(b,r)
	// r=0일때 b가 최대공약수
	// GCD(24,16) = GCD(16,8) = GCD(8,0) = 8
	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int g = gcd(a, b);
		// 최소공배수 : 두 수의 공통된 배수 중에서 가장 작은 정수
		// a*b = GCD * LCM
		// LCM = (a*b) / GCD
		int l = a * b / g;
		System.out.println(g);
		System.out.println(l);
	}
}
