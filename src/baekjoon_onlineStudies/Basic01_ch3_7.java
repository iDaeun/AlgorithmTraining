package baekjoon_onlineStudies;
//조합 0의 개수
//nCm = n개의 숫자를 m가지로 조합할 수 있는 경우의 수 (순서를 따지지 않은 숫자의 집합)
//팩토리얼과 달리 2의 개수와 5의 개수를 동시에 세어줘야 한다

// nCm = n! / (n-m)! * m!
// n!의 0의 개수  - (n-m)!의 0의 개수 - m!의 0의 개수
import java.util.Scanner;

public class Basic01_ch3_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long two = 0, five =0;
		
		for(long i=2; i<=n; i*=2) {
			two += n/i;
		}
		for(long i=2; i<=n-m; i*=2) {
			two -= (n-m)/i;
		}
		for(long i=2; i<=m; i*=2) {
			two -= m/i;
		}
		
		for(long i=5; i<=n; i*=5) {
			two += n/i;
		}
		for(long i=5; i<=n-m; i*=5) {
			two -= (n-m)/i;
		}
		for(long i=5; i<=m; i*=5) {
			two -= m/i;
		}
		
		// 둘 중 최소값 == 전체의 10의 개수
		System.out.println(Math.min(two, five));
	}
}
