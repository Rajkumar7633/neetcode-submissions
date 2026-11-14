/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head== null) return null;
        // create copy node
        Node curr = head;
        while(curr != null){
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

// asign randome pointer
        curr = head;
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
// seperate oroginal and copied list
        Node dummy = new Node(0);
        Node copucurr = dummy;

        curr = head;

        while(curr != null){
            Node copy = curr.next;
            curr.next = copy.next;

            copucurr.next= copy;
            copucurr = copy;
            curr = curr.next;
        }

        return dummy.next;
    }
}
