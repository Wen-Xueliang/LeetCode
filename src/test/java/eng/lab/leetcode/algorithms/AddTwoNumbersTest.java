package eng.lab.leetcode.algorithms;

import org.junit.Test;

public class AddTwoNumbersTest {

	@Test
	public void test() {
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

		AddTwoNumbers.ListNode listNode1 = new AddTwoNumbers.ListNode(5);

		AddTwoNumbers.ListNode listNode2 = new AddTwoNumbers.ListNode(5);

		AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode1, listNode2);
		for(int i = 0; i < 2; i ++) {
			System.out.println(result.val);
			result = result.next;
		}
	}

}
