import java.util.*;



public class Main {

  public static Scanner sc = new Scanner(System.in);

  // Task 1

  public static void main_1(String[] args) {

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

// Task 4

  public static void main_4(String[] args) {

    int m = sc.nextInt();
    int n = sc.nextInt();

    int j = 0;
    int num = 0;

    for (int i = 0; i < m * n; i++) {
      if ((i - num) * j < 10) {
        System.out.print(String.format("   %d", (i - num) * j));
      } else {
        System.out.print(String.format("  %d", (i - num) * j));
      }
      if ((i + 1) % n == 0) {
        j += 1;
        num += n ;
        System.out.println();
      }
    }
  }

// Task 5

  public static void main_5(String[] args) {

    int a = sc.nextInt();
    int b = sc.nextInt();
    int[][] matrix = new int[a][b];

    int n = 0;
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        if (i % 2 == 0) {
          matrix[i][j] = i * b + j; 
        } else {
          matrix[i][j] = (i + 1) * b - j - 1;
        }
      }
    }
    
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        if (matrix[i][j] < 10) {
          System.out.printf("  %d", matrix[i][j]);
        } else {
          System.out.printf(" %d", matrix[i][j]);
        }
      }
      System.out.println();
    }
  }

// Task 6

  public static void main(String[] args) {

    int n = sc.nextInt();
    int s = 2 * n;
    int[][] nums = new int[s+1][s+1];

    int c = (s + 1) * (s + 1) - 1;
    nums[n][n] = 0;

    for (int k = 0; k <= n; k++) {
      for (int i = k; i < s - k; i++) {
        nums[i][s - k] = c--;
      }
      for (int i = k; i < s - k; i++) {
        nums[s - k][s - i] = c--;
      }
      for (int i = k; i < s - k; i++) {
        nums[s - i][k] = c--;
      }
      for (int i = k; i < s - k; i++) {
        nums[k][i] = c--;
      }
    }

    for (int i = 0; i <= s; i++) {
      for (int j = 0; j <= s; j++) {
        if (nums[i][j] < 10) {
          System.out.printf("  %d", nums[i][j]);
        } else {
          System.out.printf(" %d", nums[i][j]);
        }
      }
      System.out.println();
    }
  }
}