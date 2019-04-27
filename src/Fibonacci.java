public class Fibonacci {
	public static void main(String[] args) {
		for(int i = 0; i < 48; i++) {
			System.out.println(i + " : " + fibonacci(i));
		}
	}

	public static int fibonacci(int i) {
		int[] baseCase = {0, 0, 1};
		if(i < 1) {
			return 0;
		}
		if (i == 1) {
			return 0;
		}
		if (i == 2) {
			return 1;
		}
		for(int j = 0; j < i; j++) {
			baseCase[0] = baseCase[1];
			baseCase[1] = baseCase[2];
			baseCase[2] = baseCase[0] + baseCase[1];
		}
		return baseCase[1];
	}
}
