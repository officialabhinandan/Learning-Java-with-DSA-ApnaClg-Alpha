package PatternProgs;

public class multiplePatterns {
    public static void main(String args[]) {
        patrn5(5, 5);
        patrn6(5);
        patrn7(5);
        patrn8(5);
        patrn9(5);
        patrn10(5);
        patrn11(5);
        patrn12(5);
        patrn13(5);

    }

    // Hollow rectangle pattern
    public static void patrn5(int n, int m) {
        for (int i = 1; i <= n; i++) { // outer loop for rows
            for (int j = 1; j <= m; j++) { // inner loop for columns
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Inverted and rotated pyramid
    public static void patrn6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) { // loop to print spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // loop to print stars
                System.out.print("*");
            }
            System.out.println(); // prints next line
        }
    }

    // Inverted half pyramid with numbers
    public static void patrn7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " "); // printing columns
            }
            System.out.println(); // next line
        }
    }

    // Floyed's triangle
    public static void patrn8(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    // 0-1 triangle pattern
    public static void patrn9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    // Butterfly pattern
    public static void patrn10(int n) {
        for (int i = 1; i <= n; i++) {

            // 1st half
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Solid Rhombus pattern
    public static void patrn11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Hollow Rhombus pattern
    public static void patrn12(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // hollow rectangle
            for (int k = 1; k <= n; k++) {
                if (i == 1 || i == n || k == 1 || k == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Diamond pattern
    public static void patrn13(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd half
        for (int i = n; i >= 1; i--) {  //only outer loop's condition gets reversed
            for (int j = 1; j <= n - i; j++) {   //inner loop same logic
                System.out.print("  ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
