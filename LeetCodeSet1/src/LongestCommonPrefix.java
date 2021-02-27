
public class LongestCommonPrefix {

	public static void main(String[] args) {
//		String strs[] = { "flower", "flow", "flight" };
		String strs[] = { "ab", "a" };
		System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
	}

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		for (int i = 0; i < strs[0].length(); i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (i == strs[j].length() || c != strs[j].charAt(i)) {
					return strs[0].substring(0, i);
				}
			}
		}
		return strs[0];
	}

}
