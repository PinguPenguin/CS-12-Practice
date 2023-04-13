public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtFront(5);
        list.addAtFront(10);
        list.addAtFront(15);
        list.addAtFront(12);
        list.addAtRear(20);
        //list.deleteVal(20);
        list.printList();
        /*
        System.out.println("sussy!");
        //list.deleteLast();
        list.insert(10);
        list.printList();
        //System.out.println(list.toString());
        //System.out.println(list.sum());
        */

        /*(Stack stacc = new Stack();
        stacc.create(1);
        stacc.push(2);
        stacc.push(3);
        stacc.push(4);
        System.out.println(stacc.peek());
        System.out.println(stacc.pop());
        System.out.println(stacc.pop());
        System.out.println(stacc.pop());
        System.out.println(stacc.pop());*/

        /*Queue q = new Queue();
        q.create(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println("peek: " + q.peek());
        System.out.println("peek: " + q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("peek: " + q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        //System.out.println(q.peek());*/
    }
}