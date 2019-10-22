package swExertAcademy;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//괄호
//4 종류의 괄호문자들 '()', '[]', '{}', '<>' 로 이루어진 문자열이 주어진다.
//이 문자열에 사용된 괄호들의 짝이 모두 맞는지 판별하는 프로그램을 작성한다.
public class No_1218 {

	public static int check(int num, String str) {
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;

		for (int i = 0; i < num; i++) {
			if (str.charAt(i) == '(') {
				one++;
			} else if (str.charAt(i) == ')') {
				one--;
			}

			if (str.charAt(i) == '[') {
				two++;
			} else if (str.charAt(i) == ']') {
				two--;
			}

			if (str.charAt(i) == '{') {
				three++;
			} else if (str.charAt(i) == '}') {
				three--;
			}

			if (str.charAt(i) == '<') {
				four++;
			} else if (str.charAt(i) == '>') {
				four--;
			}
		}

		if (one == 0 && two == 0 && three == 0 && four == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	// #부호 -> 테스트 케이스 번호 출력
	// 유효성 여부 : 1 - 유효함, 0 - 유효하지 않음

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num; String str;
		
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1; i<=10; i++) {
			num = sc.nextInt();
			str = sc.next();
			bf.write("#" + i + " " + check(num, str)+'\n');
		}
		
		bf.flush();
	}
}
