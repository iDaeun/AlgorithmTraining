package test;

public class test01 {

	public static void main(String[] args) {
		
		int N = (int)(Math.random()*10)+1;
		int[] array = new int[N];
		
		System.out.println(N);
		
		for(int i=0; i<N; i++) {
			System.out.print((int)(Math.random()*100)+0 + ",");
		}
		
		System.out.println();
		
		for(int i=0; i<N; i++) {
			System.out.print((int)(Math.random()*100)+0 + ",");
		}
		
//		int num = (int)(Math.random()*10000)+1;
//		System.out.println(num);
//		
//		int num2 = (int)(Math.random()*10000)+1;
//		System.out.println(num2);
//		
//		if(num==num2) {
//			System.out.println("정답!!");
//		} else {
//			System.out.println("틀렸어!!");
//		}

	}

}
