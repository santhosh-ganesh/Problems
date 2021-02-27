import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int nums[] = { 9, 8, 9 };
		System.out.println(new PlusOne().plusOne(nums));
	}

	public int[] plusOne(int[] digits) {
		int len = digits.length - 1;
		if (digits[len] < 9) {
			digits[len] = digits[len] + 1;
			return digits;
		}
		if (len == 0 && digits[len] >= 9) {
			return new int[] { 1, 0 };
		}
		int mod = 0;
		int digit[] = new int[len + 2];

		while (len > 0 && digits[len] >= 9) {
			digits[len] = 0;
			digits[len - 1]++;
			if (digits[len - 1] <= 9) {
				return digits;
			}
			len--;
		}
		if (digits[0] > 9) {
			digit[0] = 1;
		}
		return digit;
	}
}
