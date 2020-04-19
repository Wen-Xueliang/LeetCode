package eng.lab.leetcode.algorithms;

import java.util.Arrays;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2020/4/19 14:30
 * @Description: https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		
		int length = nums.length;
		int start = 0;
		int end = length - 1;
		
		int startNum = 0, endNum = 0;
		int posOne = 0,posTwo = 0;

		int[] sortedNums = nums.clone();
		Arrays.sort(sortedNums); //将这串数字从小到大排序
		
		for (int i = 0; i < length; i++) { //将第一个数和最后一个数相加，然后和给定的数进行判断
			if ((sortedNums[start] + sortedNums[end]) < target) {
				//如果小于给定的数，就取比小的数稍大的数，来和最后一位相加
				start++;
			} else if ((sortedNums[start] + sortedNums[end]) > target) {
				//如果大于给定的数，就取比大的数稍小的数，来和第一位相加
				end--;
			} else {
				//如果等于给定的数，那就直接返回
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
