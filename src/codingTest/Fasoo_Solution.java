package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Fasoo_Solution {

	public static int solution(String s) {

		ArrayList<Character> list = new ArrayList<Character>();

		// 입력받은 문자열 char타입으로 한 글자씩 분리하여 배열에 삽입
		for (char ch : s.toCharArray()) {
			list.add(ch);
		}

		// 경우의 수 
		int ans = 0;

		// R = [0,+1] / L = [0,-1] / U = [+1,0] / D = [-1,0]
		for (int j = 0; j < list.size(); j++) {

			int x = 0;
			int y = 0;

			if (list.get(j) == 'R') {
				y = y + 1;
			} else if (list.get(j) == 'L') {
				y = y - 1;
			} else if (list.get(j) == 'U') {
				x = x + 1;
			} else if (list.get(j) == 'D') {
				x = x - 1;
			}

				for (int l = j + 1; l < list.size(); l++) {
					if (list.get(l) == 'R') {
						y = y + 1;
						if (x == 0 && y == 0) {
							ans++;
							continue;
						} 
					} else if (list.get(l) == 'L') {
						y = y - 1;
						if (x == 0 && y == 0) {
							ans++;
							continue;
						}
					} else if (list.get(l) == 'U') {
						x = x + 1;
						if (x == 0 && y == 0) {
							ans++;
							continue;
						} 
					} else if (list.get(l) == 'D') {
						x = x - 1;
						if (x == 0 && y == 0) {
							ans++;
							continue;
						} 
					}
				}

		}

		return ans;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(solution(str));

	}

}
