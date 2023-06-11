public class IterativeAndRecursiveSearch {
    public Node IterativeSearch ( Node head , int val ){
        if ( head == null || head.next == null && head.data == val ){
            return null ;
        } else if ( head.data == val ){
            head = head.next ;
            return head ;
        }
        else {
            Node currNode = head ;
            while ( currNode.next != null ){
                if ( currNode.next.data == val ){
                    currNode.next = currNode.next.next ;
                    return head ;
                }
                currNode = currNode.next ;
            }
        }
        return head ;
    }
}
