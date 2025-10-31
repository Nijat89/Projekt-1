package h2;

public class H2_main {
	public static void main(String[] args) {

		int i = 20;
		int j = 15;
		int k = 300;
		int min;
		int max;

		// Min

		if (i < j && i < k) {
			min = i;
		} else if (j < i && j < k) {
			min = j;
		} else {
			min = k;
		}

		// Max

		if (i > j && i > k) {
			max = i;
		} else if (j > i && j > k) {
			max = j;
		} else {
			max = k;

		}

		System.out.println("Minimum:" + min);
		System.out.println("Maximum:" + max);
	}

}