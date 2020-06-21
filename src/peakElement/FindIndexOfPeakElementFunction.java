package peakElement;

public class FindIndexOfPeakElementFunction {
	// Two pointer method to solve it in O(logn)
	public int findPeakElement(int[] nums){
		int left = 0;
		
		int right = nums.length - 1;
		
		while(left < right){
			// Using a technique that prevent negative value
			int mid = left + (right - left) / 2;
			
			// If the right value of mid is bigger, then move the left pointer
			if(nums[mid] < nums[mid + 1]){
				left = mid + 1;
			} else { // Not mid - 1 since mid might be the peak
				right = mid;
			}
		}
		
		// Left is the index of the peak
		return left;
	}
}
