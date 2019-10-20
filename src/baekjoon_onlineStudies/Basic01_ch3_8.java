package baekjoon_onlineStudies;

//GCD합 (최대공약수 합)
import java.util.Scanner;

public class Basic01_ch3_8 {

	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 3

		while (t-- > 0) {
			int n = sc.nextInt(); // 4
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt(); // 10 20 30 40
			}
			
			long ans = 0;
			// 돌아가면서 두개의 값 비교, 최대공약수 찾아서 ans에 대입
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					ans += gcd(a[i], a[j]);
				}
			}
			System.out.println(ans);
		}

	}
}
