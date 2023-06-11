public class Return_Head_And_Tail_From_LinkedList {
    public Node[] findHeadAndTail ( Node head ){
        Node [] response = new Node [2] ;
        if ( head == null ){
            response[0] = null ;
            response[1] = null ;
            return response ;
        }

        if ( head.next == null ){
            response[0] = head ;
            response[1] = head ;
            return response ;
        }

        response[0] = head ;
        Node currNode = head ;
        while ( currNode.next != null ){
            currNode = currNode.next ;
        }
        response[1] = currNode ;
        return response ;
    }
}
