package baekjoon_onlineStudies;
// 단어 뒤집기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Basic01_ch2_1 {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// 몇개 작성할 것인지 숫자로 입력
		int t = Integer.parseInt(bf.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 입력한 숫자 만큼 돌리기
		while (t-- > 0) {
			// 적은 문장 뒤에는 enter붙여줌
			String str = bf.readLine() + "\n";

			Stack<Character> s = new Stack<Character>();
			
			// 문자열 --> char ch로 하나하나 대입
			for (char ch : str.toCharArray()) {
				
				// ch == enter OR ch == ' '
				if (ch == '\n' || ch == ' ') {
					// 스택이 비어있지 않으면 bw에 pop()해서 입력
					while (!s.isEmpty()) {
						bw.write(s.pop());
					}
					// 스택이 비어있으면 enter또는 ' '입력
					bw.write(ch);
					
				} else {
					// 문자일 때 --> ch를 스택에 넣기
					s.push(ch);
				}

			}
		}
	bw.flush(); // 쌓인 bw출력
	}
}
