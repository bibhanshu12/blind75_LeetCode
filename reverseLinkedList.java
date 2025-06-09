//only function 

public ListNode reverseList(ListNode head) {
        ListNode curr= head;

        ListNode pre=null;

        
       while(curr!=null){
           ListNode nexta= curr.next;
           curr.next=pre;
           pre= curr;
           curr=nexta;

       }
    return pre;

    }