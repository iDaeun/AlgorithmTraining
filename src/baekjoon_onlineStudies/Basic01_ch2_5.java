package baekjoon_onlineStudies;

// 단어 뒤집기2
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Basic01_ch2_5 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = bf.readLine();
		Stack<Character> s = new Stack<Character>();
		boolean tag = false;

		for (char ch : str.toCharArray()) {
			
			// < 태그 로 시작하거나 || 000< 태그 앞에 문자가 있을 수 있음
			if (ch == '<') {
				// 000<앞에 문자가 있을 때 -> 뒤집어서 출력
				while (!s.isEmpty()) {
					bw.write(s.pop());
				}
				// 태그 시작
				tag = true;
				// <로 시작할때 -> <출력
				bw.write(ch);
			} 
			// > 태그 끝났을 때
			else if (ch == '>') {
				// 태그 끝
				tag = false;
				// > 출력
				bw.write(ch);
			} 
			// 태그 시작할 때 (태그 안의 문자) : 뒤집기XXX
			else if (tag) {
				// 그대로 출력
				bw.write(ch);
			} 
			// 태그안의 문자가 아님 : 뒤집기OOO
			else {
				if (ch == ' ') {
					while (!s.isEmpty()) {
						bw.write(s.pop());
					}
					bw.write(ch);
				} else {
					s.push(ch);
				}
			}
		}
		
		// 마지막에 스택이 비어있지 않은 경우 --> 다시 빼주기
		while(!s.empty()) {
			bw.write(s.pop());
		}
		
		bw.flush();
	}
}
