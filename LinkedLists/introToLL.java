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
        // i = index -1; temp = previous
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){   // making it int type to return the val of the deleted node
       // corner case 1 : empty ll
       if(size == 0){
        System.out.println("The ll is empty");
        return Integer.MAX_VALUE;  // returning positive/negative max value as invaild value
       }
       // corner case 2 : ll with a single node
       if(size == 1){
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
       }
        // general case
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        // corner case 1 : empty ll
       if(size == 0){
        System.out.println("The ll is empty");
        return Integer.MAX_VALUE;  // returning positive/negative max value as invaild value
       }
       // corner case 2 : ll with a single node
       if(size == 1){
        int val = tail.data;
        head = tail = null;
        size = 0;
        return val;
       }
        // prev i : size-2 // prev = previous node
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;  // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int iterativeSearch(int key){  // time complexity O(n) or linear time complexity
        Node temp = head; // making a teemporary node and assigning it to the head
        int i = 0;

        while(temp != null){
            if(temp.data == key){  // key found case
                return i;
            } 
        temp = temp.next;
        i++;
        }
        return -1;  // key not found case
    }

    public int helperFunc(Node head, int key){   // T.C. O(n), linear
        // base case
        if(head == null){
            return -1;
        }
        //logic
        if(head.data == key){
            return 0;
        }
        int idx = helperFunc(head.next, key);
        if(idx == -1){
            return -1;
        }
    
        return idx+1;
    }

    public int recursiveSearch(int key){   // since we can only send key argument here, we take help from a helpeer function
      return helperFunc(head, key);
    }

    public void reverseLL(){  // time complexity = O(n);
        Node prev = null;
        Node curr = tail = head;  // since we are doing reverse of linkedlist, the head is also tail here.
        Node next;

        // In Java we always assign right to left. So In Line no 181, head is assigned in tail and then tail is assign in curr.
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public void deleteNthNodefromEnd(int n){
        // calculate size : here we're already using size variable, but for the sake of future coding completition we're calculating here again.
        int syz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            syz++;
        }

        // corner case : remove first node
        if(n == syz){
            head = head.next;
            return;
        }

        // normal case
        int idx = 1;
        int idxToFind = syz-n;
        Node prev = head;

        while(idx < idxToFind){
            prev = prev.next;
            idx++;
        }
        
        prev.next = prev.next.next;
        return;

    }

    // Slow-fast approach
    public Node findMidNode(Node head){   // to find the middle node. Kind off helper function in this context
      Node slow = head;
      Node fast = head;

      while(fast != null && fast.next != null){
        slow = slow.next; // +1
        fast = fast.next.next; // +2
      }
      return slow;
    }

    public boolean checkPalindrome(){
        // corner case: empty ll
        if(head == null || head.next == null){
            return true;
        }
        // step 1: find middle node
        Node miNode = findMidNode(head);

        // step 2: Reverse 2nd half
        Node prev = null;
        Node curr = miNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node right = prev; // right half head
        Node left = head; // left half head 

        // step 3: compare 1st and 2nd half of the 
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
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
        ll.removeFirst();
        ll.print();
        System.out.println("The size of the ll after removing the first node is " + size);
        ll.removeLast();
        ll.print();
        System.out.println("The size of the ll after removing the first node is "+ size);
        System.out.println(ll.iterativeSearch(3));
        System.out.println(ll.iterativeSearch(10));

        System.out.println(ll.recursiveSearch(3));
        System.out.println(ll.recursiveSearch(10));

        // reverse
        ll.reverseLL();
        ll.print();

        ll.deleteNthNodefromEnd(2);
        ll.print();

        System.out.println(ll.checkPalindrome());

        ll.addLast(2);
        ll.addLast(3);
        ll.print();
        System.out.println(ll.checkPalindrome());  // prints palindrome or not

        


    }
}
