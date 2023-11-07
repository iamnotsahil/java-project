import java.util.Scanner;

public class TwodArray3 {
    public static void main(String[] args) {
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
        if (columns1 != rows2) {
            System.out.println("The matrices cannot be multiplied.");
            return;
        }
        int[][] result = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("The product of the matrices is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

