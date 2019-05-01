package eng.lab.leetcode.algorithms;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum/
 * 
 * @author wenxl
 * @createTime 2019/04/21
 *
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		
		int length = nums.length;
		int start = 0;
		int end = length - 1;
		
		int startNum = 0, endNum = 0;
		int posOne = 0,posTwo = 0;

		int[] sortedNums = nums.clone();
		Arrays.sort(sortedNums);
		
		for (int i = 0; i < length; i++) {
			if ((sortedNums[start] + sortedNums[end]) < target) {
				start++;
			} else if ((sortedNums[start] + sortedNums[end]) > target) {
				end--;
			} else {
				startNum = sortedNums[start];
				endNum = sortedNums[end];
				break;
			}
		}
		
		boolean flagOne = false, flagTwo = false;
		for(int i = 0; i < length; i++) {
			if(nums[i] == startNum && !flagOne) {
				posOne = i;
				flagOne = true;
			} else if(nums[i] == endNum && !flagTwo) {
				posTwo = i;
				flagTwo = true;
			}
			if(flagOne && flagTwo) {
				break;
			}
		}
		return new int[]{posOne, posTwo};
	}
}
