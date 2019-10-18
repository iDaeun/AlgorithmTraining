package baekjoon_onlineStudies;
//오큰수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Basic01_ch2_7 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// 몇개 숫자를 입력할 것인지 입력
		int n = Integer.parseInt(bf.readLine());
		int[] a = new int[n]; // a배열 = 입력한 수열넣는 배열
		int[] ans = new int[n]; // 정답배열 = 오큰수배열
		String[] temp = bf.readLine().split(" "); // temp배열 = 입력받은 수열 찢어서 넣는 배열

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp[i]); // 입력받은 수열 --> a배열에 넣기
		}

		Stack<Integer> s = new Stack<Integer>(); // 스택 = 아직 오큰수를 찾지 못한 숫자의 index
		s.push(0); // 맨 처음 : 1번째 숫자 index 넣기
		
		// --- 오큰수 찾는 과정 start ---
		for (int i = 1; i < n; i++) {
			
			// 비어있으면 넣기
			if (s.isEmpty()) {
				s.push(i);
			}
			// 스택 제일 위에 있는 수 < 현재 수
			// s.peek()의 오큰수 == a[i]
			while (!s.isEmpty() && a[s.peek()] < a[i]) {
				ans[s.pop()] = a[i]; // 정답배열에 수 넣기 && 스택에서 빼기
			}
			// 현재 index 넣기
			s.push(i);
		}
		// --- 오큰수 찾는 과정 end ---
		
		// 과정이 끝나고도 남아있다 == 오큰수가 없다
		while (!s.empty()) {
			ans[s.pop()] = -1;
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < n; i++) {
			bw.write(ans[i] + " ");
		}
		bw.write("\n");
		bw.flush();
	}
}
