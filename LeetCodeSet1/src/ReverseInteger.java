
public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(new ReverseInteger().reverse(-123));
	}

	public int reverse(int x) {
		int reverse = 0;
		while (x != 0) {
			int mod = x % 10;
			if (reverse < Integer.MIN_VALUE / 10 || reverse > Integer.MAX_VALUE / 10) {
				return 0;
			}
			reverse = (reverse * 10) + mod;
			x = x / 10;
		}
		return reverse;
	}
}
