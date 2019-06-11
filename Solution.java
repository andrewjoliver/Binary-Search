class Solution{
	public static int binarySearch(int[] nums, int target){
        int min = 0;
		int max = nums.length - 1;
		int midpoint;

		while(min < max){
			midpoint = ( (max - min) / 2 ) + min;

			if (nums[midpoint] == target){
				return midpoint;
			}
			else if (nums[midpoint] < target){
				min = midpoint + 1;
			}
			else{
				max = midpoint - 1;
			}
		}
		return nums[min] == target ? min : -1;
	}
	public static void main(String[] args){
		int[] nums = {1, 2, 4, 8, 19, 23, 40, 55, 56, 57, 80, 91};
		System.out.println(binarySearch(nums, 91));
	}
}