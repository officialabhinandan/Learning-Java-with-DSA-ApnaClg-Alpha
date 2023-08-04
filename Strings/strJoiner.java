 /*Java does not have a built-in StringJoiner class. However, Java has a StringJoiner class introduced in Java 8.
  It's used to concatenate strings with a delimiter between them. The StringJoiner class provides a convenient way to build comma-separated
 lists, CSV strings, and more.
Here's an example of how the StringJoiner class works:*/
package Strings;
import java.util.StringJoiner;

public class strJoiner {
    public static void main(String[] args) {
        // Create a StringJoiner with the desired delimiter
        StringJoiner joiner = new StringJoiner(", ");

        // Add elements to the StringJoiner
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Orange");

        // Merge another StringJoiner
        StringJoiner otherJoiner = new StringJoiner("-");
        otherJoiner.add("Grape");
        otherJoiner.add("Pineapple");

        joiner.merge(otherJoiner);

        // Convert the StringJoiner to a single string
        String result = joiner.toString();

        System.out.println(result); // Output: Apple, Banana, Orange, Grape-Pineapple
    }

}

/*In this example, we create a StringJoiner named joiner with the delimiter ", ".
 We then add three fruits to it using the add() method. Next, we create another StringJoiner named otherJoiner with the delimiter "-" and 
 add two fruits to it. We then use the merge() method to combine otherJoiner with the original joiner. Finally, we convert the joiner to a 
 single string using the toString() method, and the result is printed to the console.*/
