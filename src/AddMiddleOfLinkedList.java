public class AddMiddleOfLinkedList {
    public Node addInMiddle ( Node head , int val ){
        Node newNode = new Node(val) ;
        Node slow = head ;
        Node fast = head ;
        while ( fast.next != null && fast.next.next!= null ){
            fast = fast.next.next ;
            slow = slow.next ;
        }
        Node slowNext = slow.next ;
        slow.next = newNode ;
        newNode.next = slowNext ;
        return head ;
    }
}
