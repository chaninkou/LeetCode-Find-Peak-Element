package peakElement;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,2,2,3,1};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindIndexOfPeakElementFunction solution = new FindIndexOfPeakElementFunction();
		
		System.out.println("Solution: " + solution.findPeakElement(nums));
	}
}
