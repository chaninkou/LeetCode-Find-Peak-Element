package peakElement;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {5,6,5,4,5,6,5};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindIndexOfPeakElementFunction solution = new FindIndexOfPeakElementFunction();
		
		System.out.println("Solution: " + solution.findPeakElement(nums));
	}
}
