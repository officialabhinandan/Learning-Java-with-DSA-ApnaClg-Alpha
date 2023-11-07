package ArrayListProgs;

import java.util.ArrayList;

public class multiDArrayList {
    public static void main(String args[]){
        // Implementing multi dimensional arraylist.
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // sub list 1
        ArrayList<Integer> subList1 = new ArrayList<>();
        subList1.add(1); subList1.add(2); subList1.add(3);
        mainList.add(subList1);

        // sb list 2
        ArrayList<Integer> subList2 = new ArrayList<>();
        subList2.add(4); subList2.add(5); subList2.add(6);
        mainList.add(subList2);

        // printing the list in nested loop
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i); // getting the whole internal list
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        // printing the mainList
        System.out.println("The mainList is: " + mainList);  // just like 2D arrays.
    }
}
