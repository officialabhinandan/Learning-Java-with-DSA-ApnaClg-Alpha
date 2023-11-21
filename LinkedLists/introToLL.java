package LinkedLists;

public class introToLL {

    // introToLL(){
    //     System.out.println("hello");
    // }
    public class Node{
        // creating instance variable of the Node class
        int data; // node data
        Node next; // ref to the next node (data of Node type)

        // assigning value through constructor
        Node(int data){
            this.data = data;
            this.next = null; // initially referes to null
        }
    }    
        // creating instance variable of the introToLL class
        public static Node head;
        public static Node tail;

        /* We'll create methods for
        add(), 
        remove(), 
        print() and 
        search() operations 
        */
        public void addFirst(int data){     // time complexity = O(1) or constant time complexity
            // step 1 - create new node
            Node newNode = new Node(data);

            if(head == null){  // in case of an empty LinkedList
              head = tail = newNode;
              return;
            }

            // step 2 - newNode next = head (linking step)
            newNode.next = head;

            // step 3 - making newNode the new head
            head = newNode;
        }
    
    public static void main(String args[]){
        introToLL ll = new introToLL();
        ll.addFirst(1);
        ll.addFirst(2);
        

    }
}
