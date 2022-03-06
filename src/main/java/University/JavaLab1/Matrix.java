import java.util.Scanner;

public class Matrix {
    static int sumOfNumber(int n){
        int sum = 0;
        while(n != 0){
            sum += (n % 10);
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args){
        int m, n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input m");
        m = scanner.nextInt();
        System.out.println("Input n");
        n = scanner.nextInt();

        scanner.close();

        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                mat[i][j] = (int)(Math.random() * 50 + 1);
            }
        }
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        int[] resultVector = new int[m];
        for (int i = 0; i < n; i++) {
            int maxSumOfNumber = sumOfNumber(mat[i][0]);

            for (int j = 1; j < m; j++) {
                if (sumOfNumber(mat[i][j]) > maxSumOfNumber) {
                    maxSumOfNumber = sumOfNumber(mat[i][j]);
                }
            }
            resultVector[i] = maxSumOfNumber;
        }
        System.out.println("~~~~~~~~~");
        for(int i = 0; i < m; i++){
            System.out.print(resultVector[i] + " ");
        }
    }
}
