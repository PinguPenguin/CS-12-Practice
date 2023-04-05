public class Stack {
    private Node top;
    class Node
    {
        int info;
        Node link;
        Node (int i, Node n)
        {
            info = i;
            link = n;
        }
    }

    private void push (int i){
        top = new Node(i, top);
    }
}
