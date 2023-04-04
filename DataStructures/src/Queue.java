public class Queue {
    private Node front;
    private Node rear;

    class Node {
        int info;
        Node link;
        Node(int i, Node n) {
            info = i;
            link = n;
        }
    }

    public void printQueue() {
        Node currentNode = front;
        while (currentNode != null) {
            System.out.println(currentNode.info);
            currentNode = currentNode.link;
        }
    }

    public void enqueue(int i) {
        Node temp = new Node (i, null);
        if (rear == null) { //empty
            front = rear = temp;
        } else {
            rear = rear.link = temp;
        }
    }

    public int dequeue() {
        if (rear == null) {
            System.out.println("Nothing to dequeue, returning 0.");
            return 0;
        } else if (front == rear) { //1 node
            int temp = front.info;
            front = rear = null;
            return temp;
        }
        int temp = front.info;
        front = front.link;
        return temp;
    }

    public int peek() {
        if (rear == null) {
            System.out.println("Nothing to peek, returning 0.");
            return 0;
        }
        return front.info;
    }

    public boolean isEmpty() {
        if (front != null) return false;
        return true;
    }
}
