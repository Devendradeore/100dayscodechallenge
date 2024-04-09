

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode new_node =new SinglyLinkedListNode(data);
        if(head==null)
        {
            head = new_node;
            return head;
        
        }
        SinglyLinkedListNode current_node = head;
        while(current_node.next!=null)
        {
            current_node= current_node.next;
        }
        
        current_node.next=new_node;
        return head;

    }

