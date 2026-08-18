public class Perfect {
	public static boolean perfectNumber(int number) {

		int sum = 0;

		for (int count = 1; count <= number / 2; count++) {

			if (number % count == 0) {
				sum = sum + count;

			}

		}

		if (sum == number) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(perfectNumber(8128));
	}
}