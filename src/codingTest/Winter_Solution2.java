package codingTest;

import java.util.Scanner;

public class Winter_Solution2 {
	public static long solution(int w, int h) {
		long answer = 1;
		
		if(w>h) {
			answer = w*h - (h*2);
		} else if(h>w) {
			answer = w*h - (w*2);
		} else if(w==h) {
			answer = w*h - w;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int h = sc.nextInt();

		System.out.println(solution(w, h));

	}

}
