public class LinkedLists1 {
    private Node head;

    public void deleteFirst(){
        if (head == null) {
            System.out.println("Sorry, Dave. I'm afraid I can't do that.");
        } else {
            head = head.link.link;
        }
    }

    public void deleteLast(){
        if (head == null) {
            System.out.println("Sorry, Dave. I'm afraid I can't do that.");
        } else {
            head = head.link.link;
        }
    }

    public int sum() {
        int sum = 0;
        for (Node temp = head; temp!= null; temp = temp.link){
            sum += temp.info;
        }
        return sum;
    }

    public void addAtFront (int item){
        head = new Node(item, head);
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            for (Node temp = head; temp!=null; temp = temp.link) {
                System.out.print(temp.info + " ");
            }
            System.out.print("\n");
        }
    }

    class Node {
        int info;
        Node link;
        Node (int i, Node n){
            info = i;
            link = n;
        }
    }

}
