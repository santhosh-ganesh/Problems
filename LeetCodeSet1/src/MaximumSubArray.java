
public class MaximumSubArray {

	public static void main(String[] args) {
//		int nums[] = { -2,1,-3,4,-1,2,1,-5,4 };
		int nums[] = { -1, 0, -2 };
		System.out.println(new MaximumSubArray().maxSubArray(nums));
	}

	public int maxSubArray(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int add = nums[i];
			if (add > max) {
				max = add;
			}
			for (int j = i + 1; j < nums.length; j++) {
				add = add + nums[j];
				if (add > max) {
					max = add;
				}
			}
		}
		return max;
	}
}
