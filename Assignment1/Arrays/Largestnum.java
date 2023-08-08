package Assignment1;

public class Largestnum {

	public static void main(String[] args) {
		int a[] = { 21, 23, 42, 97, 65, 89 };
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
