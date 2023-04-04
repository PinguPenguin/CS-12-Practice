public class ListTester {
    static Queue q1 = new Queue();
    public static void main(String[] args) {
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.printQueue();
        System.out.println(q1.dequeue());
        q1.printQueue();
    }
}
