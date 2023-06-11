public class FindAndRemoveNthNodeFromEnd {
    public Node removeNthFromEnd ( Node head , int nth ){
        int length = 0 ;
        Node currNode = head ;
        while ( currNode != null ){
            currNode = currNode.next ;
            length ++ ;
        }
        if ( nth == length ){
            head = head.next ;
            return head ;
        }
        length = length - nth ;
        int start = 1 ;

        currNode = head ;
        while ( start != length ){
            start++ ;
            currNode = currNode.next ;
        }

        currNode.next = currNode.next.next ;
        return head ;
    }
}
