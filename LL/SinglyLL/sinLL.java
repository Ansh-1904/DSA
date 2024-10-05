class Node{
    int data;
    Node next;

    Node(int data1, Node next1)
    {
        this.data=data1;
        this.next=next1;
    }

    Node(int data1)
    {
        this.data=data1;
        this.next=null;
    }
};



public class sinLL {

    private static Node convertArrToLL(int[] arr) {
        if (arr.length == 0) return null;  // If array is empty, return null

        Node head = new Node(arr[0]);  // Initialize the head
        Node current = head;  // Pointer to traverse the list

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);  // Create new node and link it
            current = current.next;  // Move the current pointer to the new node
        }

        return head;  // Return the head of the list
    }

    private static Node deleteHead(Node head)
    {
        if(head==null) return head;
        head=head.next;
        return head;
    }

    private static Node deleteTail(Node head)
    {
        if(head==null || head.next==null) return null;
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    private static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");  // Print the data
            current = current.next;  // Move to the next node
        }
        System.out.println();  // New line at the end
    }

    private static Node deleteK(Node head, int k)
    {
        if(head==null) return head;
        if(k==1)
        {
            head=head.next;
            return head;
        }

        int count=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null)
        {
            count++;
            if(count==k)
            {
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    private static Node deleteValue(Node head, int value)
    {
        if(head==null) return head;
        if(value==head.data)
        {
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null)
        {
            if(value==temp.data)
            {
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    private static Node insertHead(Node head,int elem)
    {
        // Node temp=new Node(elem);
        // temp.next=head;
        // head=temp;
        // return head;

        //or //better way

        Node temp=new Node(elem, head);
        return temp;

        //or
        // return new Node(elem,head);
    }

    private static Node insertAtEnd(Node head, int elem)
    {

        if(head==null) return new Node(elem);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new Node(elem);
        return head;
    }

    private static Node insertK(Node head, int elem, int k)
    {
        if(head==null)
        {
            if(k==1)
            {
                return new Node(elem);
            }
            else{
                return head;
            }
        }
        if(k==1)
        {
            return new Node(elem,head);
        }

        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            if(count==k-1)
            {
                Node newNode=new Node(elem);
                newNode.next=temp.next;
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

    private static Node insertElemBeforeX(Node head, int elem, int x)
    {
        if(head==null)
        {
            return head;
        }
        if(x==head.data)
        {
            return new Node(elem,head);
        }

        
        Node temp=head;
        Node prev=head;
        while(temp!=null)
        {
            if(temp.data==x)
            {
                Node newNode=new Node(elem);
                newNode.next=prev.next;
                prev.next=newNode;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        // Node head=new Node(arr[2]);


        //delete head

        // Node head=convertArrToLL(arr);
        // head=deleteHead(head);
        // System.out.print("Linked List after deleting head: ");
        // printLinkedList(head);
        
        //delete tail

        // Node head=convertArrToLL(arr);
        // head=deleteTail(head);
        // System.out.print("Linked List after deleting tail: ");
        // printLinkedList(head);

        //delete kth position

        // Node head=convertArrToLL(arr);
        // head=deleteK(head,3);
        // System.out.print("Linked List after deleting kth position: ");
        // printLinkedList(head);

        //delete node of given data value

        // Node head=convertArrToLL(arr);
        // head=deleteValue(head,6);
        // System.out.print("Linked List after deleting node with giving value as data : ");
        // printLinkedList(head);

        //insert head

        // Node head=convertArrToLL(arr);
        // head=insertHead(head,5);
        // System.out.print("Linked List after inserting new head : ");
        // printLinkedList(head);
        
        //insert at the end

        // Node head=convertArrToLL(arr);
        // head=insertAtEnd(head,5);
        // System.out.print("Linked List after inserting at the end : ");
        // printLinkedList(head);

        //insert at k with given elem

        // Node head=convertArrToLL(arr);
        // head=insertK(head,5,3);
        // System.out.print("Linked List after inserting at k with given elem : ");
        // printLinkedList(head);

        //insert elem before xData

        Node head=convertArrToLL(arr);
        head=insertElemBeforeX(head,5,6);
        System.out.print("Linked List after inserting at k with given elem : ");
        printLinkedList(head);
        
    }
}