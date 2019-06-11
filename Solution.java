class Solution{
	public static int binarySearchIndex(int[] nums, int target){
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
	public static int findNumElementsGreaterThanK(int[] nums, int k){
        int min = 0;
		int max = nums.length - 1;
		int midpoint;
		int numElementsLessThan = nums.length;

		while(min <= max){
			midpoint = ( (max - min) / 2 ) + min;

			if (nums[midpoint] > k){
				numElementsLessThan = midpoint;
				max = midpoint - 1;
			} 
			else{
				min = midpoint + 1;
			}
		}
		return nums.length - numElementsLessThan;
	}
	public static void main(String[] args){
		int[] nums = {1, 3, 7, 19, 25, 29, 35};
		System.out.println(findNumElementsGreaterThanK(nums, 2));
	}
}