public class RemoveFirstAndLast {
    public Node removeFirst ( Node head ){
        if (head == null || head.next == null){
            return null ;
        } else {
            head = head.next ;
            return head ;
        }
    }

    public Node removeLast ( Node head ){
        if (head == null || head.next == null){
            return null ;
        } else {
            Node currNode = head ;
            while ( currNode.next.next != null ){
               currNode = currNode.next ;
            }
            currNode.next = null ;
            return head ;
        }
    }
}
