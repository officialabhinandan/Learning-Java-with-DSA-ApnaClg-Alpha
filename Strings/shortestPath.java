package Strings;

public class shortestPath {
    public static void main(String args[]) {
        String path = "WNEENESENNN";
        String path2 = "NSEW";

        // calling function
        System.out.println("For path 1: " + findShortestPath(path));
        System.out.println("For path 2: " + findShortestPath(path2));

    }
    
    //time complexity O(n).
    public static float findShortestPath(String str) {
        int x = 0;
        int y = 0;
        // traverse through the string
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i); // optional

            // towards west
            if (dir == 'W') {
                x--;
            }
            // towards north
            if (dir == 'N') {
                y++;
            }
            // towards east
            if (dir == 'E') {
                x++;
            }
            // towards south
            if (dir == 'S') {
                y--;
            }

        }
        return (float) Math.sqrt((x * x) + (y * y)); // type casting from float to double
    }
}
