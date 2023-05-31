package DZ.DZ_3;

public class DZ_3 {


    public class Node{
        int value;
        Node next;
        Node previous;
    }
    Node head;
    Node tail;

    public void reverse(Node currentNode, Node previousNode){
        if (currentNode.next == null){
            head = currentNode;
        }
        else {
            reverse(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }
}
