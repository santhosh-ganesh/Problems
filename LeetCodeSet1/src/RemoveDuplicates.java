
public class RemoveDuplicates {

	public static void main(String[] args) {
//		int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int nums[] = { 1, 1, 2 };
		System.out.println(new RemoveDuplicates().removeDuplicates(nums));
	}

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int count = 1;
		for (int i = 0, j = 1; i < nums.length - 1; i++) {
			while (j < nums.length && nums[i] == nums[j]) {
				j++;
			}
			if (j < nums.length) {
				nums[i + 1] = nums[j];
				count++;
			}
		}
		return count;
	}
	
	public int removeDuplicate(int[] nums) {
		if(nums.length==0) {
			return 0;
		}
		int i=0;
		for(int j=1;j<nums.length;j++) {
			if(nums[j]!=nums[i]) {
				i++;
				nums[i]=nums[j];
			}
		}
		return i+1;
	}
}
