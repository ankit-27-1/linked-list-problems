public class file4 {
    static class Node{
        int data;
        Node next;
    };
    static Node push( Node head_ref, int new_data){
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }
    static void swapNodes(Node head,int x,int y){
        if(x==y){
            return;
        }
        Node currX=head;
        Node prevX=null;
        while(currX!=null && currX.data!=x){
            prevX=currX;
            currX=currX.next;
        }
        Node currY=head;
        Node prevY=null;
        while(currY!=null && currY.data!=y){
            prevY=currY;
            currY=currY.next;
        }
        if (currX == null || currY == null)
            return;
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;
        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;
        Node temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;
    }
    static void printList( Node head){
        Node temp = head;
        while (temp != null){
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n");
    }
    public static void main(String[] args) {
        Node head = null;
        int M=2, N=4;
        head=push(head,5);
        head=push(head,4);
        head=push(head,3);
        head=push(head,2);
        head=push(head,1);
        swapNodes(head,M,N);
        printList(head);
    }
}
