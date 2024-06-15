package lr9.tasks.linked_list_Task8;

public class RunMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.addElement(0);
        linkedList.addElement(1);
        linkedList.addElement(2);
        linkedList.addElement(4);
        linkedList.addElement(5);
        linkedList.insertElement(3, 1);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove(1);
        System.out.println(linkedList);
    }
}