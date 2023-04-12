public class Stack {
    private Node top;
    class Node {
        int info;
        Node link;
        Node (int i, Node n){
            info = i;
            link = n;
        }
    }

    public void create(int val) {
        if (top == null) {
            top = new Node(val, null);
        } else {
            System.out.println("bruh");
        }
    }

    public void push(int val) {
        Node next = new Node(val, top);
        top = next;
    }

    public int peek(){
        if (top != null){
            return top.info;
        }
        System.out.println("shit");
        return 0;
    }

    public boolean isEmpty(){
        return (top == null);
    }

    public int pop(){
        Node temp = top;
        if (!isEmpty() && top.link != null) {
            top = top.link;
            return temp.info;
        } else if (!isEmpty()) {
            top = null;
            return temp.info;
        } else {
            System.out.println("shiet");
            return 0;
        }
    }

}
