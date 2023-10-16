//Cycle Detection using Floyd's Algorithm. (Hare and Tortoise Algorithm);


static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode hare = head;
        SinglyLinkedListNode tortoise  = head;
        
        while(hare != null && hare.next != null){
            hare = hare.next.next;
            tortoise = tortoise.next;
            
            if(hare == tortoise){
                return true;
            }
        }
        
        return false;
    }
