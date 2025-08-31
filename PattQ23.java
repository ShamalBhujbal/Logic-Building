// 		 *
// 		***
//	   *****
//    *******
//   *********
//   *********
//    *******
//     *****
//      ***
//       *

// Diamond Pattern
class PattQ23 {
    public static void main(String args[]) {
        int n = 5; // half height

        // Top half
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
