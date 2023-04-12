public class LinkedList {
    private Node head;

    class Node {
        int info;
        Node link;
        Node (int i, Node n) {
            info = i;
            link = n;
        }
    }

    public int sum(){
        int sum = 0;
        Node current = head;
        while (current != null) {
            sum += current.info;
            current = current.link;
        }
        return sum;
    }

    public void printList(){
        Node current = head;
        if (current == null){
            System.out.println("well shit");
        }
        while (current != null) {
            System.out.println(current.info);
            current = current.link;
        }
    }

    public void addAtFront(int i) {
        Node n = new Node(i, head);
        head = n;
    }

    public void addAtRear(int i) {
        Node n = new Node(i, null);
        Node current = head;
        while (current.link != null) {
            current = current.link;
        }
        current.link = n;
    }

    public void deleteFirst(){
        if (head != null){
            head = head.link;
        }
    }

    public void deleteLast() {
        Node current = head;
        Node prev = new Node(0, null);
        while (current != null) {
            if (current.link == null) {
                current = null;
                prev.link = null;
            } else {
                prev = current;
                current = current.link;
            }
        }
    }

    public void deleteVal(int v){
        Node current = head;
        Node prev = head;
        while (current.info != v && current.link != null) {
            prev = current;
            current = current.link;
        }
        prev.link = current.link;
    }

    public String toString(){
        String str = "";
        for (Node current = head; current != null; current = current.link) {
            str += Integer.toString(current.info);
        }
        return str;
    }

    public void insert(int val) {
        Node current = head;
        Node prev = new Node(0, null);
        boolean located = false;
        while (current != null && !located) {
            if (current.info > val) {
                located = true;
            } else {
                prev = current;
                current = current.link;
            }
        }
        Node insertion = new Node(val, current);
        if (current == head) {
            head = insertion;
        } else {
            prev.link = insertion;
        }
    }
}
