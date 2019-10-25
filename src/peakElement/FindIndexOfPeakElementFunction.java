package peakElement;

public class FindIndexOfPeakElementFunction {
	// Two pointer method to solve it in O(logn)
	public int findPeakElement(int[] nums){
		// Left pointer is start
		int left = 0;
		
		// Right pointer is end of the array
		int right = nums.length - 1;
		
		// If both pointer haven't meet at the same spot yet, continue
		while(left < right){
			// Getting the middle value using a technique that prevent negative
			int mid = left + (right - left) / 2;
			
			// If the right value of mid is bigger, then move the left pointer
			if(nums[mid] < nums[mid + 1]){
				left = mid + 1;
			} else { // If the right value of mid is smaller, then move right pointer
				right = mid;
			}
		}
		
		// Left is the index of the peak
		return left;
	}
}
