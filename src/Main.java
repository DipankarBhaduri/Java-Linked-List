public class Main {
    public static void main(String[] args) {
        CreateLinkedList createLinkedList = new CreateLinkedList();
        Node head = null ;

        head = createLinkedList.addLast(head,4);
        head = createLinkedList.addLast(head,5);
        head = createLinkedList.addLast(head,6);
        head = createLinkedList.addLast(head,7);
        head = createLinkedList.addLast(head,6);
        head = createLinkedList.addLast(head,5);
        head = createLinkedList.addLast(head,4);



        PrintLinkedList printLinkedList = new PrintLinkedList() ;
        printLinkedList.printLL(head);
        System.out.println();

        CheckLinkedListPalindrome checkLinkedListPalindrome = new CheckLinkedListPalindrome();
        boolean ans = checkLinkedListPalindrome.checkPalindrome(head) ;
        System.out.println(ans);

        printLinkedList.printLL(head);
        System.out.println();
    }
}