import java.util.Scanner;

public class TwodArray5 {
    public static void main(String6[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix1: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns of matrix1: ");
        int columns1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][columns1];
        System.out.println("Enter the elements of matrix1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the number of rows of matrix2: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns of matrix2: ");
        int columns2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][columns2];
        System.out.println("Enter the elements of matrix2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("The matrices are not equal.");
            return;
        }
        boolean equal = true;
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    equal = false;
                    break;
                }
            }
        }
        if (equal) {
            System.out.println("The matrices are equal.");
        } else {
            System.out.println("The matrices are not equal.");
        }
    }
}

