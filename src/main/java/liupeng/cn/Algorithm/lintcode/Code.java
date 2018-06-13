package liupeng.cn.Algorithm.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Code {

	public boolean hasCycle(ListNode head) {
		// write your code here
		ListNode h1 = head,h2=head;
		while(h2!=null){
			h1=h1.next;
			h2=h2.next;
			if(h2==null){
				return false;
			}
			h2=h2.next;
			if(h2==null){
				return false;
			}
			if(h1.val==h2.val){
				return true;
			}
		}
		return false;
		
		
	}

	public static void main(String... arg) {
		Code code = new Code();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;

	}

}
