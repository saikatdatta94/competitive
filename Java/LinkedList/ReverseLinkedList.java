public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
    // Write your code here
        if(head == null){ 
          return head; 
        }
        SinglyLinkedListNode prev;
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode next;
        prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
}
