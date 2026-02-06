import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter size of row " + i + ": ");
            int size = sc.nextInt();
            arr[i] = new int[size];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Enter values for row " + i + ":");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nJagged Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
