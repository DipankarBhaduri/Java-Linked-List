public class ReverseLinkedList {
    public Node reverseLL (Node head ){
        Node currNode = null ;

        while ( head != null ){
            Node next = head.next ;

            head.next = currNode ;
            currNode = head ;
            head = next ;
        }

        return currNode ;
    }
}
