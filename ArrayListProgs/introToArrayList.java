package ArrayListProgs;
import java.util.ArrayList;
import java.util.Collections;  // or import java.util.*; // importing all at once.

public class introToArrayList {
    public static void main(String args[]){
        // creating an ArrayList of Integer type. 
        ArrayList<Integer> myList1 = new ArrayList<>();
        // similarly we can also create ArrayList of String/Boolean/Float classes.
        //ArrayList<String> myList2 = new ArrayList<>();
        //ArrayList<Boolean> myList3 = new ArrayList<>();

        // performing operations in the list
        // add operation - T.C = O(1)
        myList1.add(1);
        myList1.add(2);
        myList1.add(3);
        myList1.add(4);
        myList1.add(5);

        System.out.println(myList1);

        myList1.add(4, 9); // adding an element to an particular index. T.C = O(n)/linear
        System.out.println(myList1);

        // get operation - T.C = O(1)
        int num = myList1.get(0);
        System.out.println("Element at index 0 is " + num);
        System.out.println("Element at index 1 is " + myList1.get(2));

        // delete/remove operation - T.C = O(n)
        myList1.remove(1);
        System.out.println("After deletion of index 1 " + myList1);

        // set operation - T.C = O(n)
        myList1.set(1, 10);
        System.out.println("After setting index no 1 " + myList1);

        // contains operation - T.C = O(n)
        System.out.println(myList1.contains(10));
        System.out.println(myList1.contains(11));

        // to find the length of the ArrayList 
        System.out.println(myList1.size()); // integer type

        // printing directly
        System.out.println("Printing directly: " + myList1); 

        // printing by iteration (using .size() and .get() method
        System.out.print("Printing using iteration: ");
        for(int i=0; i<myList1.size(); i++){  // just like .length proparty in array or .length() method in string
            System.out.print(myList1.get(i) + " "); // just like arr[i] in array or str.charAt(i) in string
        }
        System.out.println();

        // printing ArrayList in reverse - T.C = O(n)
        System.out.println("Printing an ArrayList in reverse: ");
        for(int i=myList1.size()-1; i>=0; i--){
            System.out.print(myList1.get(i) + " ");
        }
        System.out.println();

        // find maximun number in an ArrayList - T.C = O(n)/linear time
        int maxNum = Integer.MIN_VALUE; // (-) infinity in java
        for(int i=0; i<myList1.size(); i++){
            maxNum = Math.max(maxNum, myList1.get(i));
            /* similarly,
             if(myList1.get(i) > maxNum){
                maxNum = myList1.get(i);
             }
             */
        }
        System.out.println("Printing the maximum number of an ArrayLisy: " + maxNum);

        //calling swap function
        System.out.println("ArrayList before swapping elements: " + myList1);
        swapNum(myList1, 1, 3);
        System.out.println("ArrayList after swapping elements: " + myList1);

        // sorting an ArrayList
        System.out.println("ArrayList before sorting: " + myList1);

        // ascending order
        Collections.sort(myList1);
        System.out.println("ArrayList after sorting (ascending order): " + myList1);

        // descending order
        // here Collections.reverseOrder() is a comparator function which defines the rules of sorting in reverse order.
        Collections.sort(myList1, Collections.reverseOrder()); 
        System.out.println("ArrayList after sorting (descending order): " + myList1);

    }
    // swapping two numbers inside an ArrayList
    public static void swapNum(ArrayList<Integer> list, int idx1, int idx2){
      int temp = list.get(idx1);
      list.set(idx1, list.get(idx2));
      list.set(idx2, temp);
    }
}
