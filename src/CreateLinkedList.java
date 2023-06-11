public class CreateLinkedList {
    int length = 0 ;

    public int getLength (){
        return length ;
    }
    public Node addLast (Node head,int val){
        Node node = new Node(val) ;
        if (head == null){
            head = node ;
            length++;
            return head ;
        }

        Node curNode = head ;
        while ( curNode.next != null ){
            curNode = curNode.next ;
        }

        curNode.next = node ;
        length++;
        return head ;
    }

    public Node addFirst ( Node head , int val ){
        Node node = new Node(val) ;
        if (head == null){
            head = node ;
            length++;
            return head ;
        }
        node.next = head ;
        head = node ;
        return head ;
    }
}
