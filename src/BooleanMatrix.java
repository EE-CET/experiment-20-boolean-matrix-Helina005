
    
 import java.util.Scanner;

public class BooleanMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions R and C
        if (!sc.hasNextInt()) return;
        int r = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 0; i < r; i++) {
            boolean hasOne = false;
            int[] currentRow = new int[c];

            // Read the row and check for a '1'
            for (int j = 0; j < c; j++) {
                currentRow[j] = sc.nextInt();
                if (currentRow[j] == 1) {
                    hasOne = true;
                }
            }

            // Print the modified row based on the check
            for (int j = 0; j < c; j++) {
                if (hasOne) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
                
                // Formatting: space between elements
                if (j < c - 1) System.out.print(" ");
            }
            System.out.println(); // New line after each row
        }
        sc.close();
    }
}
