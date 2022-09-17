/*

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
public static Node deleteElement(Node head,int k) {
//enter your code here
Node start = head;
Node end = head;
while(k-->0){
    end = end.next;
}
if(end == null){
    start = start.next;
    return start;
}
while(end.next != null){
    start = start.next ;
    end = end.next;
}
if(start.next.next == null){
    start.next = null;
    return head;
}
start.next = start.next.next;
return head;
}
