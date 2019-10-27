package codingTest;

import java.util.Scanner;
import java.util.Stack;

class Winter_Solution1 {

	public static int solution(int[][] land, int height) {

		int answer = 0;

		// 양옆
		for (int i = 0; i < land.length; i++) {
			for (int j = 0; j < land[i].length; j++) {
				if (Math.abs(land[i][j] - land[i][j + 1]) > height) {
					answer++;
				}
			}
		}

		// 위 아래
		for (int i = 0; i < land.length; i++) {

			Stack<Integer> stack = new Stack<Integer>();

			for (int j = 0; j < land[i].length; j++) {
				if (Math.abs(land[i][j] - land[i + 1][j]) > height) {

					if (stack.peek() > Math.abs(land[i][j] - land[i + 1][j])) {
						stack.pop();
						stack.push(Math.abs(land[i][j] - land[i + 1][j]));
					}
				}
			}
			answer = answer + stack.pop();
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] array = new int[300][300];

		for (int i = 0; i < 300; i++) {
			for (int j = 0; j < 300; j++) {
				int num = sc.nextInt();
				array[i][j] = num;
			}
		}

		int height = sc.nextInt();

		System.out.println(solution(array, height));
	}
}
