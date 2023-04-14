class Stack {
    private Node top;
    class Node{
        int info;
        Node link;
        Node (int i, Node n) {
            info = i;
            link = n;
        }
    }

    public void create(int val) {
        if (top != null) {
            System.out.println("Occupied, can't create.");
        } else {
            top = new Node (val, null);
        }
    }

    public void push(int val) {
        if (top == null) {
            System.out.println("Can't push to empty stack.");
        } else {
            Node next = new Node (val, top);
            top = next;
        }
    }

    public int peek() {
        if (top != null){
            return top.info;
        }
        System.out.println("Nothing to peek, returning 0.");
        return 0;
    }

    public int pop() {
        if (top != null){
            int val = top.info;
            top = top.link;
            return val;
        }
        System.out.println("Nothing to pop, returning 0.");
        return 0;
    }
}