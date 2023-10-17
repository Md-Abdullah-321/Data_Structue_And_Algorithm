

public static int length(SinglyLinkedListNode node){
        int l = 0;
        
        SinglyLinkedListNode head = node;
        
        while (head != null) {
            l++;
            head = head.next;
        }
        
        return l;

}



static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        int l1 = length(head1);
        int l2 = length(head2);
        
        int d = 0;
        SinglyLinkedListNode ptr1;
        SinglyLinkedListNode ptr2;
        
        if(l1 > l2){
            d = l1 - l2;
            ptr1 = head1;
            ptr2 = head2;
        }else {
            d = l2 - l1;
            ptr1 = head2;
            ptr2 = head1;
        }
        
        while (d != 0) {
            ptr1 = ptr1.next;
            
            if(ptr1 == null) return -1;
            d--;
        }
        
        while (ptr1 != null && ptr2 != null) {
            if(ptr1 == ptr2){
                return ptr1.data;
            }
            
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        return -1;
}
