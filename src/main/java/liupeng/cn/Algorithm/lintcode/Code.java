package liupeng.cn.Algorithm.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Code {

	public ListNode deleteDuplicates(ListNode head) {
        // write your code here
		
    }

	public static void main(String... arg) {
		Code code = new Code();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(11);
		ListNode l4 = new ListNode(15);
		ListNode l5 = new ListNode(22);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		ListNode out = code.deleteDuplicates(l1);
		while(out!=null){
			System.out.println(out.val);
			out=out.next;
		}
		
	}

}
