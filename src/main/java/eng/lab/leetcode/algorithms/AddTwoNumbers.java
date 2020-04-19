package eng.lab.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2020/4/19 14:30
 * @Description: https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        List<Integer> list = new ArrayList<Integer>();
        int carry = 0;

        while(true) {
            int node1Value = 0;
            int node2Value = 0;
            if(currentNode1 == null && currentNode2 == null) {
                if(carry == 1) list.add(carry);
                break;
            } else if(currentNode1 == null){
                node2Value = currentNode2.val;
                currentNode2 = currentNode2.next;
            } else if(currentNode2 == null){
                node1Value = currentNode1.val;
                currentNode1 = currentNode1.next;
            } else {
                node1Value = currentNode1.val;
                node2Value = currentNode2.val;
                currentNode1 = currentNode1.next;
                currentNode2 = currentNode2.next;
            }
            int sum = node1Value + node2Value + carry;

            if(sum > 9) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;
            }
            list.add(sum);
        }
        for(int i = list.size() - 1; i >= 0; i --) {
            ListNode currentNode = null;
            if(result == null) {
                result = new ListNode(list.get(i));
            } else {
                currentNode = new ListNode(list.get(i));
                currentNode.next = result;
                result = currentNode;
            }
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
