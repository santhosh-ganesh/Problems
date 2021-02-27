
public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(new PalindromeNumber().isPalindrome(10));
	}

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int rev = 0, orig = x;
		while (x > 0) {
			int mod = x % 10;
			rev = rev * 10 + mod;
			x /= 10;
		}
		return orig == rev;
	}
}
