package eng.lab.leetcode.algorithms;

import org.junit.Test;

public class TwoSumTest {

	@Test
	public void test() {
		TwoSum twoSum = new TwoSum();
		
		int[] nums = {2,5,5,11};
		int target = 10;
		int[] retNums = twoSum.twoSum(nums, target);
		for(int i = 0; i < retNums.length; i ++) {
			System.out.println(retNums[i]);
		}
	}

}
