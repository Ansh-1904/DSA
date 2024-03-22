import java.util.*;
class Node<T>{
    T data;
    Node<T> next;
    Node(T data)
    {
        this.data=data;
        //this.Node=Null; //next default value is alreay set to null
    }
}

class DoubleNode{
    Node<Integer> head;
    Node<Integer> tail;
    DoubleNode(Node<Integer> head, Node<Integer> tail)
    {
        this.head=head;
        this.tail=tail;
    }
}

public class linkedListUse {

    public static Node<Integer> createLL()
    {
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }

    public static void printLL(Node<Integer> head)
    {
        Node<Integer> temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void increment(Node<Integer> head)
    {
        Node<Integer> temp=head;
        while(temp!=null)
        {
            temp.data++;
            temp=temp.next;
        }
    }

    public static int lengthLL(Node<Integer> head)
    {
        Node<Integer> temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void printIthNode(Node<Integer> head, int i){
		
		Node<Integer> temp=head;
		int count=0;
		while(temp!=null)
		{
			if(count==i)
			{
				System.out.println(temp.data);
			}
			temp=temp.next;
			count++;
		}
	}

    public static Node<Integer> takeInput()
    {
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node<Integer> head=null, tail=null;
        while(data!=-1)
        {
            Node<Integer> currentNode=new Node<Integer>(data);
            if(head==null)
            {
                //Make this node as head node and tail node
                head=currentNode;
                tail=currentNode;
            }
            else{
                // Node<Integer> tail=head;
                // while(tail.next!=null)
                // {
                //     tail=tail.next;
                // }
                tail.next=currentNode;
                tail=tail.next; //tail=currentNode; same
            }
            data=sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> insert(Node<Integer> head, int elem, int pos)
    {
        Node<Integer> currentNodeI=new Node<>(elem);
        Node<Integer> prev=head;
        int count=0;
        if(pos==0)
        {
            currentNodeI.next=head;
            head=currentNodeI;
            return currentNodeI;
        }
        else{
            while(count<pos-1 && prev!=null)
            {
                count++;
                prev=prev.next;
            }
            if(prev!=null)
            {
                currentNodeI.next=prev.next;
                prev.next=currentNodeI;
            }
            return head;
        }
    }

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		Node<Integer> prev=head;
		int count=0;
		if(head==null)
		{
			return head;
		}
		if(pos==0)
		{
			return head.next;
		}
		else{
			while(count<pos-1 && prev.next!=null)
			{
				prev=prev.next;
				count++;
			}
			if(prev.next!=null)
			{
				prev.next=prev.next.next;
			}
			return head;
		}
	}

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n)
    {
        if(head!=null && n>0)
        {
            Node<Integer> temp=head;
            Node<Integer> nHead=temp;
            Node<Integer> prevNewHead=temp;
            int length=0;
            while(temp!=null)
            {
                temp=temp.next;
                length++;
            }
            temp=head;
            int index=0;
            while(temp.next!=null)
            {
                if(index==length-n-1)
                {
                    nHead=temp.next;
                    prevNewHead=temp;
                }
                temp=temp.next;
                index++;
            }
            prevNewHead.next=null;
            if(temp.next==null)
            {
                temp.next=head;

            }
            return nHead;
            
        }
        else{
            return head;
        }
    }

    public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//Your code goes here
		if(head==null || head.next==null)
		{
			return head;

		}

		Node<Integer> t1=head;
		Node<Integer> t2=head.next;

		while(t2!=null )
		{
			if(t1.data==t2.data )
			{
				t2=t2.next;
			}
			else{
				t1.next=t2;
				t1=t2;
			}
		}
		t1.next=t2;
		return head;
	}

    public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		int count=0;
		Node<Integer> temp=head;
		if(head==null)
		{
			return -1;
		}
		
			while(temp.data!=n && temp.next!=null)
			{
				temp=temp.next;
				count++;
			}
			if(temp.data==n)
			{
				return count;
			}
			
		return -1;
	}

    public static void printReverseLL(Node<Integer> head)
    {
        if(head==null)
        {
            return ;
        }
        printReverseLL(head.next);
        System.out.print(head.data+" ");
    }

    public static void printRecursive(Node<Integer> head)
    {
        if(head==null)
        {
            return;
        }
        System.out.print(head.data+" ");
        printRecursive(head.next);
    }

    public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here
		ArrayList<Integer> arr=new ArrayList<>();
		while(head!=null)
		{
			arr.add(head.data);
			head=head.next;
		}
		int start=0, end=arr.size()-1;
		while(start<end)
		{
			if(arr.get(start)!=arr.get(end))
			{
				return false;
			}
			else{
				start++;
				end--;
			}
		}
		return true;
	}

    public static Node<Integer> insertRecur(Node<Integer> head, int elem, int pos)
    {
        if(head==null && pos>0)
        {
            return head;
        }
        if(pos==0)
        {
            Node<Integer> newNode=new Node<>(elem);
            newNode.next=head;
            return newNode;
        }
        else{
            Node<Integer> smallerHead=insertRecur(head.next, elem, pos-1);
            head.next=smallerHead;
            return head;
        }
    }

    public static Node<Integer> deleteRecur(Node<Integer> head, int pos)
    {
        if(head==null && pos>=0)
        {
            return head;
        }
        if(pos==0)
        {
            return head.next;
        }
        else{
            Node<Integer> smallHead=deleteRecur(head.next,pos-1);
            head.next=smallHead;
            return head;
        }
    }

    public static Node<Integer> reverseR(Node<Integer> head){
        if(head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> smallerHead=reverseR(head.next);
        head.next.next=head;
        head.next=null;
        return smallerHead;
    }

    //reverse LL using double node
    // public static DoubleNode reverseLLDN(Node<Integer> head)
    // {
    //     DoubleNode ans;
    //     if(head==null || head.next==null)
    //     {
    //         ans=new DoubleNode();
    //         ans.head=head;
    //         ans.tail=head;
    //         return ans;
    //     }
    //     DoubleNode smallAns=reverseLLDN(head.next);
    //     smallAns.tail.next=head;
    //     head.next=null;
    //     ans=new DoubleNode();
    //     ans.head=smallAns.head;
    //     ans.tail=head;
    //     return ans;
    // }

    public static Node<Integer> reverseIterative(Node<Integer> head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> prev=head;
        Node<Integer> currentNode=head.next;
        while(currentNode!=null){
            Node<Integer> fwrd=currentNode.next;
            currentNode.next=prev;
            prev=currentNode;
            currentNode=fwrd;
        }
        head.next=null;
        return prev;
    }

    public static Node<Integer> midpointLL(Node<Integer> head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> slow=head;
        Node<Integer> fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {

        Node<Integer> head=takeInput(); //createLL();
        
        //head=insert(head,80,0);
        //head=deleteNode(head,0);
        //head=appendLastNToFirst(head,3);
        // head=removeDuplicates(head);
        // printReverseLL(head);
        //System.out.println("Is given LL palindrome ? = "+isPalindrome(head));
        // printRecursive(head);
        // head=insertRecur(head,20,2);
        //head=deleteRecur(head,2);
        // DoubleNode ans=reverseLLDN(head);
        // printLL(ans.head);
        // head=reverseR(head);
        // head=reverseIterative(head);
        head=midpointLL(head);
        System.out.println(head.data);
        // printLL(head);
        // System.out.println("Node present at index="+findNode(head,3));

        //increment(head);
        //System.out.println(lengthLL(head));
        //printIthNode(head,0);
        // Node<Integer> n1=new Node<>(10);
        // System.out.println(n1); // by printing n1 you will get the address where the node is present.
        // System.out.println(n1.data);
        // System.out.println(n1.next);
    }
}
