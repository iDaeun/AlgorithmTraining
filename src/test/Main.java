package test;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static int solution(int[] goods, int[] boxes) {

		int[] array = new int[goods.length];
		int ans = 0;

		for (int i = 0; i < goods.length; i++) {
			for (int j = 0; j < boxes.length; j++) {
				if (goods[i] == boxes[j]) { // 같은 숫자 먼저 검색
					array[i] = goods[i]; // 해당 숫자는 array에 대입
					goods[i] = 0; // 같은 숫자 있는 goods인덱스에 0대입
					boxes[j] = 0; // 같은 숫자 있는 boxes인덱스에 0대입
				} else if (boxes[j] - goods[i] > 0) {
					array[i] = goods[i]; // 해당 숫자는 array에 대입
					goods[i] = 0; // 같은 숫자 있는 goods인덱스에 0대입
					boxes[j] = 0; // 같은 숫자 있는 boxes인덱스에 0대입
				}
			}
		}

		for (int k = 0; k < array.length; k++) {
			if (array[k] != 0) {
				ans++;
			}
		}

		int answer = ans;
		return answer;
	}

	public static void main(String[] args) {

		int[] goods = { 5, 3, 7 };
		int[] boxes = { 3, 7, 6 };

		int answer = solution(goods, boxes);
		System.out.print(answer);
	}

}
