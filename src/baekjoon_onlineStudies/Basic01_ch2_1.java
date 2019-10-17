package baekjoon_onlineStudies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Basic01_ch2_1 {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (t-- > 0) {
			String str = bf.readLine() + "\n";

			Stack<Character> s = new Stack<Character>();

			for (char ch : str.toCharArray()) {

				if (ch == '\n' || ch == ' ') {
					while (!s.isEmpty()) {
						bw.write(s.pop());
					}
					bw.write(ch);
				} else {
					s.push(ch);
				}

			}
		}
		bw.flush();
	}
}
