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

        Node head=convertArrToLL(arr);
        head=deleteK(head,3);
        System.out.print("Linked List after deleting kth position: ");
        printLinkedList(head);
        
    }
}