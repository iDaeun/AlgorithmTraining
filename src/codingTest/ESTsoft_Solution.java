package codingTest;

import java.util.ArrayList;
import java.util.List;

public class ESTsoft_Solution {

	public static int solution(String S) {

		char[] array = S.toCharArray();

		int num1 = 0;
		List<Character> list1 = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();

		for (int i = 0; i < S.length(); i++) {

			if ((S.length() - i) >= 3) { 

				if (array[i] == array[i + 1] && array[i + 1] == array[i + 2]) {
					list1.add(array[i + 1]);
					list1.add(array[i + 2]);

					num1 = i;

					break;
				}

				list1.add(array[i]);

			}

		}

		while ((S.length() - (S.length() - num1)) >= 3) {

			for (int i = num1 + 1; i < S.length(); i++) {

				if ((S.length() - i) >= 3) {

					if (array[i] == array[i + 1] && array[i + 1] == array[i + 2]) {
						list2.add(array[i + 1]);
						list2.add(array[i + 2]);

						break;
					}

					list2.add(array[i]);

				}

			}

			if (list2.size() > list1.size()) {
				list1 = list2;
			}

		}

		System.out.println(list1);

		return list1.size();
	}

	public static void main(String[] args) {
		System.out.println(solution("baaabbabbb"));
	}
}
