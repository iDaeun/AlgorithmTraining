package baekjoon_onlineStudies;
//스택수열
import java.util.Scanner;
import java.util.Stack;

public class Basic01_ch2_3 {

	public static void solve(int[] a) {

		int n = a.length;
		Stack<Integer> stack = new Stack<Integer>();
		int m = 0;
		StringBuilder sb = new StringBuilder();

		// int x = 수열 a에서 하나씩 꺼냄
		for (int x : a) {
			// x > m
			if (x > m) {
				// x보다 하나 아래까지 ++
				while (x > m) {
					// x  m ++m 
					// 3  0  1 
					// 3  1  2 
					// 3  2  3 
					stack.push(++m);
					sb.append("+\n");
				}
				// x == m 일때 하나 빼기
				stack.pop();
				sb.append("-\n");
			}
			// x < m
			else {
				// stack맨 위 숫자 보기 != x
				if (stack.peek() != x) {
					// 스택에서 뺄떄마다 하나의 수열을 만들기 때문
					System.out.println("NO");
					return;
				}
				stack.pop();
				sb.append("-\n");
			}
		}
		System.out.println(sb);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		solve(a);
	}
}