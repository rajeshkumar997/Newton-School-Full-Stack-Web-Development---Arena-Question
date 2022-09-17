/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node addElement(Node head, int k) {
//enter your code here
    Node temp = head;
    if(temp == null){
        head = new Node(k);
        return head;
    }
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = new Node(k);
    return head;
}
