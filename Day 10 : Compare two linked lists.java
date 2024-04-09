
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        if(head1==null && head2==null)   return true;
        
        SinglyLinkedListNode first_runner = head1;
        SinglyLinkedListNode second_runner = head2;
        
    
        
        while(first_runner!=null && second_runner!=null)
        {
            
            if(first_runner.data!=second_runner.data)
            {
                break;
            }
            if(first_runner.next==null && second_runner.next==null)
            {
                return true;
            }
            
            first_runner=first_runner.next;
            second_runner=second_runner.next;
        }

      return false;
    }

