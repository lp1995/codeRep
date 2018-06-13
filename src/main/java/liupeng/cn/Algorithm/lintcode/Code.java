package liupeng.cn.Algorithm.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Code {

	public TreeNode sortedListToBST(ListNode head) {
        
		TreeNode out = sort(head,null);
		return out;
    }
	
	public TreeNode sort(ListNode head, ListNode end){
		if(head==null){
			return null;
		}
		if(head==end){
			return null;
		}
		ListNode a=head;
		ListNode b=head;
		boolean flag = true;
		while(a.next!=end){
			a=a.next;
			if(flag){
				b=b.next;
			}
			flag=!flag;
		}
		
		TreeNode node = new TreeNode(b.val);
		TreeNode left = sort(head,b);
		TreeNode right = sort(b.next,end);
		node.left = left;
		node.right = right;
		return node;
	}
	
	
	public static void main(String... arg) {
		Code code = new Code();
		ListNode l1  = new ListNode(1);
		ListNode l2  = new ListNode(2);
		ListNode l3  = new ListNode(3);
		ListNode l4  = new ListNode(4);
		ListNode l5  = new ListNode(5);
		ListNode l6  = new ListNode(6);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		TreeNode a= code.sortedListToBST(l1);
		System.out.println(a);

	}

}
