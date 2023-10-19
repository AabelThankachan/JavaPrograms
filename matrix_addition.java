
//matrix addition
import java.util.*;

class matrix_addition {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter number of rows and columns in first matrix:");
            int m1 = s.nextInt();
            int n1 = s.nextInt();
            System.out.println("Enter number of rows and columns in second matrix:");
            int m2 = s.nextInt();
            int n2 = s.nextInt();
            int arr1[][] = new int[m1][n1];
            int arr2[][] = new int[m2][n2];
            int arr3[][] = new int[m1][n1];

            if (m1 != m2 || n1 != n2) {
                System.out.println("Matrix addition not possible");
            } else {
                System.out.println("Enter first matrix:");
                for (int i = 0; i < m1; i++) {
                    for (int j = 0; j < n1; j++) {
                        arr1[i][j] = s.nextInt();
                    }
                }

                System.out.println("Enter second matrix:");
                for (int i = 0; i < m2; i++) {
                    for (int j = 0; j < n2; j++) {
                        arr2[i][j] = s.nextInt();
                    }
                }

                for (int i = 0; i < m1; i++) {
                    for (int j = 0; j < n1; j++) {
                        arr3[i][j] = arr1[i][j] + arr2[i][j];
                    }
                }

                System.out.println("First matrix is:");
                for (int i = 0; i < m1; i++) {
                    for (int j = 0; j < n1; j++) {
                        System.out.print(arr1[i][j] + "  ");
                    }
                    System.out.println();
                }

                System.out.println("Second matrix is:");
                for (int i = 0; i < m2; i++) {
                    for (int j = 0; j < n2; j++) {
                        System.out.print(arr2[i][j] + "  ");
                    }
                    System.out.println();
                }

                System.out.println("Resultant matrix is:");
                for (int i = 0; i < m1; i++) {
                    for (int j = 0; j < n1; j++) {
                        System.out.print(arr3[i][j] + "  ");
                    }
                    System.out.println();
                }
            }
        }
    }
}