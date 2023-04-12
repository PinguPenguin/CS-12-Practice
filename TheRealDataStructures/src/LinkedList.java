class LinkedList {
    private Node head;
    class Node{
        int info;
        Node link;
        Node (int i, Node n) {
            info = i;
            link = n;
        }
    }

    public void addAtFront(int val) {
        if (head == null) {
            head = new Node (val, null);
        } else {
            Node next = new Node (val, head);
            head = next;
        }
    }

    public void printList(){
        for (Node current = head; current != null; current = current.link) {
            System.out.println(current.info);
        }
    }

    public void addAtRear(int val) {
        Node next = new Node(val, null);
        Node current = head;
        while (current.link != null) {
            current = current.link;
        }
        current.link = next;
    }

}