public class Queue {
    private Node rear;
    private Node front;

    class Node {
        int info;
        Node link;
        Node (int i, Node n){
            info = i;
            link = n;
        }
    }

    public void create(int val) {
        if (rear != null) {
            System.out.println("error!");
        } else {
            rear = new Node(val, null);
            front = rear;
        }
    }

    public void enqueue(int val) {
        if (rear == null) {
            System.out.println("empty");
        } else {
            Node next = new Node(val, null);
            rear.link = next;
            rear = next;
        }
    }

    public int dequeue(){
        if (front == null) {
            System.out.println("front empty");
            return 0;
        } else {
            int temp = front.info;
            front = front.link;
            return temp;
        }
    }

    public int peek() {
        if (front != null){
            return front.info;
        }
        System.out.println("front peek empty");
        return 0;
    }
}
