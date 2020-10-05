import java.util.*;



public class Main {

    // Task 1

    public static void main_1(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] matrix = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] matrix_1 = new int[b][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix_1[j][a-i-1] = matrix[i][j];
            }
        }

        System.out.println(b + " " + a);

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(matrix_1[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Task 2

    public static void main_2(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[][] matrix = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i + j > a - 1) {
                    matrix[i][j] = 2;
                } else if (i + j == a - 1) {
                    matrix[i][j] = 1;
                } else if (i + j < a - 1) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0 ; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Task 3

    public static void main_3(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        boolean result = true;

        int[][] matrix = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    result = false;
                    break;
                }
            }
        }

        if (result) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}