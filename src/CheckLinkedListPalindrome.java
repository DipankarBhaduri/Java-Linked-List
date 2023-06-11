public class CheckLinkedListPalindrome {
    public boolean checkPalindrome ( Node head ){
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList() ;
        Node slow = head ;
        Node fast = head ;

        while ( fast.next != null && fast.next.next != null ){
            slow = slow.next ;
            fast = fast.next.next ;
        }

        Node reverseSecondHalf = reverseLinkedList.reverseLL(slow.next) ;
        slow.next = null ;

        while ( reverseSecondHalf != null && head != null){
            if ( reverseSecondHalf.data != head.data ){
                return false ;
            }

            reverseSecondHalf = reverseSecondHalf.next ;
            head = head.next ;
        }
        return true ;
    }
}
