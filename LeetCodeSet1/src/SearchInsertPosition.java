
public class SearchInsertPosition {

	public static void main(String[] args) {
		int nums[] = { 1, 3, 5, 6 };
		System.out.println(new SearchInsertPosition().searchInsert(null, 5));
	}

	public int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
			if (nums[i] > target) {
				return i;
			}
		}
		return nums.length;
	}
}
