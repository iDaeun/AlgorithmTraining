package baekjoon_onlineStudies;
//에디터
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Basic01_ch2_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			left.push(s.charAt(i));
		}
		
		int m = Integer.parseInt(br.readLine());
		
		while(m-- >0) {
			String[] line = br.readLine().split(" "); 
			char what = line[0].charAt(0);
			
			// 커서 왼쪽으로 한칸 옮김 = 문자 왼 -> 오 
			if(what == 'L') {
				if(!left.empty()) {
					right.push(left.pop());
				}
			// 커서 오른쪽으로 한칸 옮김 = 문자 오 -> 왼
			} else if(what=='D') {
				if(!right.empty()) {
					left.push(right.pop());
				}
			// $를 커서 왼쪽에 추가, 커서는 오른쪽에 위치 = 새로운 문자 -> 왼
			} else if(what=='P') {
				char c = line[1].charAt(0);
				left.push(c);
			// 커서 왼쪽에 있는 문자 삭제 = 문자 왼 -> 삭제
			} else if(what=='B') {
				if(!left.empty()) {
					left.pop();
				}
			}
		}
		
		// m == 0이 된 후, 왼 -> 오 모두 옮김
		while(!left.empty()) {
			right.push(left.pop());
		}
		
		// 오 --> 다시 빼서 수정된 문자열 생성
		StringBuilder sb = new StringBuilder();
		while(!right.empty()) {
			sb.append(right.pop());
		}
		
		System.out.println(sb);
	}
}