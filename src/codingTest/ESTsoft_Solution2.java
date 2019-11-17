package codingTest;

import java.util.Stack;

public class ESTsoft_Solution2 {

	public static int solution(String S) {
		int length = S.length();
		char[] array = S.toCharArray();

		Stack<Character> stack = new Stack<Character>();
		Stack<Character> stack1 = new Stack<Character>();

		Character check = ' ';
		int size = 0;
		int num = 0;

		for (int i = 0; i < array.length; i++) {

			if (stack.size() > 0) {
				if (stack.peek() == array[i]) {
					if (check != array[i]) {
						stack.push(array[i]);
						check = array[i];
					} else {
						num = i;
						size = stack.size();
						check = ' ';
						break;
					}
				} else {
					if(i==length-1) {
						stack.push(array[i]);
						size = stack.size();
						break;
					} else {
						stack.push(array[i]);
						check = ' ';
					}

				}

			} else {
								
				stack.push(array[i]);
				check = ' ';
			}

		}		

		if (num > 0) {

			while (length-- > 0) {

				for (int i = num - 1; i < array.length; i++) {

					if (stack1.size() > 0) {

						if (stack1.peek() == array[i]) {
							if (check != array[i]) {
								stack1.push(array[i]);
								check = array[i];
							} else {
								if (size < stack1.size()) {
									size = stack1.size();
								}
								num = i;
								check = ' ';
								stack1.clear();
								break;
							}
						} else {
							stack1.push(array[i]);
							check = ' ';
						}

					} else {
						stack1.push(array[i]);
						check = ' ';
					}

				}
			}

		}

		return size;
	}

	public static void main(String[] args) {
		System.out.println(solution("aaaaabababbbaaabbabbaaa"));
		
		// aabababb - 8
		// aabbabbaa - 9
	}
}
