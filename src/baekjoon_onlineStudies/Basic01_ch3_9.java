package baekjoon_onlineStudies;

//#17087
//숨박꼭질6 = 최대공약수 구하기
import java.util.Scanner;

public class Basic01_ch3_9 {

	static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 동생
		int s = sc.nextInt(); // 수빈
		int[] a = new int[n]; // 수빈 위치 ~ 동생 위치의 차이값

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int diff = Math.abs(x - s);
			a[i] = diff;
		}

		// 수빈이가 이동할 수 있는 거리 D = 동생 위치 차이값과의 약수
		int ans = a[0];
		for (int i = 1; i < n; i++) {
			ans = gcd(ans, a[i]); // 모든 동생과의 위치 차이값에 대한 최대공약수
		}

		System.out.println(ans);

	}
}
