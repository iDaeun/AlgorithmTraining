package baekjoon_onlineStudies;
//쇠막대기
import java.util.Scanner;
import java.util.Stack;

public class Basic01_ch2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 괄호들 입력 : 예) ()(((()())(())()))(())
		String a = sc.nextLine().trim();
		int n = a.length();

		Stack<Integer> s = new Stack<Integer>();
		int ans = 0;
		
		// 괄호의 index입력해야함
		for (int i = 0; i < n; i++) {
			char c = a.charAt(i);
			
			// 괄호 시작 ( --> index입력
			if (c == '(') {
				s.push(i);
			} 
			// 괄호 끝 ) 
			else {
				// 바로 직전괄호의 index + 1 == 현재 괄호
				if (s.peek() + 1 == i) {
					s.pop(); // 뺴내기
					ans += s.size(); // stack값의 개수만큼 자른 거 ++ (stack안의 값은 '('의 개수 == 막대기의 개수)
				} else {
				// 1이상 차이날 때 == 막대기의 끝
					s.pop(); // 빼내기
					ans += 1; // 1추가 (막대기1개를 레이저가3번 자르면 --> 막대기4조각으로 나눠지기 때문)
				}
			}
		}
		System.out.println(ans);
	}
}
