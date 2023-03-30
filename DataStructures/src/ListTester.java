public class ListTester {
    static LinkedLists1 list1 = new LinkedLists1();
    public static void main(String[] args) {
        list1.printList();
        list1.addAtFront(10);
        list1.printList();
        list1.addAtFront(15);
        list1.printList();
        list1.deleteFirst();
        list1.printList();
        list1.addAtFront(20);
        list1.printList();
        //System.out.println("Sum: " + list1.sum());
    }
}
