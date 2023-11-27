package LinkedLists;

public class introToLL {

    // introToLL(){
    // System.out.println("hello");
    // }
    public class Node {
        // creating instance variable of the Node class
        int data; // node data
        Node next; // ref to the next node (data of Node type)

        // assigning value through constructor
        Node(int data) {
            this.data = data;
            this.next = null; // initially referes to null
        }
    }

    // creating instance variable of the introToLL class
    public static Node head;  // head node
    public static Node tail;  // tail node
    public static int size;   // to track the size of the ll

    /*
     * We'll create methods for
     * add(),
     * remove(),
     * print() and
     * search() operations
     */
    public void addFirst(int data) { // time complexity = O(1) or constant time complexity
        // step 1 - create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) { // in case of an empty LinkedList
            head = tail = newNode;
            return;
        }

        // step 2 - newNode next = head (linking step)
        newNode.next = head;

        // step 3 - making newNode the new head
        head = newNode;
    }

    public void addLast(int data) { // time complexity: O(1)
        // step 1
        Node newNode = new Node(data);
        size++;

        // corner case - empty ll
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 3 - linking step
        tail.next = newNode;
        tail = newNode;
    }

    public void print() { // time complexity = O(n) / linear time complexity
        // base case - empty LinkedList
        if (head == null) {
            System.out.println("The linkedlist is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int index, int data) { // time complexity = O(n) / linear time complexity
        // corner case - if we try add at index 0 (addFirst using addMiddle)
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0; // to calculate the index of temporary node

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        // i = imdex -1; temp = previous
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String args[]) {
        introToLL ll = new introToLL();
        ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(3);
        // ll.print();
        ll.addLast(4);
        ll.addMiddle(2, 9);
        // printing the linkedlist
        ll.print();
        System.out.println("The total size of the ll is " + size);

    }
}
