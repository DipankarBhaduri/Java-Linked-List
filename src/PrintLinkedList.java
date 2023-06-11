public class PrintLinkedList {
    public void printLL ( Node head ){
        Node currNode = head ;
        while ( currNode != null ){
            System.out.print(currNode.data+"->");
            currNode = currNode.next ;
        }
    }
}
