package dreamly.timeComplexicity;

public class Main {

	public static void main(String[] args) {

		// 数据规模每次增大10倍
		for (int x = 1; x <= 9; x++) {

			int n = (int) Math.pow(10, x);

			long startTime = System.currentTimeMillis();

			long sum = 0;
			for (int i = 0; i < n; i++) {
				sum += i;
			}

			long endTime = System.currentTimeMillis();

			System.out.println("sum = " + sum);
			System.out.println("10^" + x + " : " + (endTime - startTime) + "ms");
			System.out.println();
		}
		/*
		 * sum = 45 10^1 : 0ms
		 * 
		 * sum = 4950 10^2 : 0ms
		 * 
		 * sum = 499500 10^3 : 0ms
		 * 
		 * sum = 49995000 10^4 : 1ms
		 * 
		 * sum = 4999950000 10^5 : 4ms
		 * 
		 * sum = 499999500000 10^6 : 9ms
		 * 
		 * sum = 49999995000000 10^7 : 41ms
		 * 
		 * sum = 4999999950000000 10^8 : 123ms
		 * 
		 * sum = 499999999500000000 10^9 : 1038ms
		 */

		// 数据规模每次增大2倍
		for (int x = 1; x <= 9; x++) {

			int n = (int) Math.pow(2, x);

			long startTime = System.currentTimeMillis();

			long sum = 0;
			for (int i = 0; i < n; i++) {
				sum += i;
			}

			long endTime = System.currentTimeMillis();

			System.out.println("sum = " + sum);
			System.out.println("2^" + x + " : " + (endTime - startTime) + "ms");
			System.out.println();
		}
		/*
		 * sum = 1 2^1 : 0ms
		 * 
		 * sum = 6 2^2 : 0ms
		 * 
		 * sum = 28 2^3 : 0ms
		 * 
		 * sum = 120 2^4 : 0ms
		 * 
		 * sum = 496 2^5 : 0ms
		 * 
		 * sum = 2016 2^6 : 0ms
		 * 
		 * sum = 8128 2^7 : 0ms
		 * 
		 * sum = 32640 2^8 : 0ms
		 * 
		 * sum = 130816 2^9 : 0ms
		 */

	}
}
