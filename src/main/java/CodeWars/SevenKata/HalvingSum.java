package CodeWars.SevenKata;

/*Given a positive integer n, calculate the following sum:

n + n/2 + n/4 + n/8 + ...
All elements of the sum are the results of integer division.

Example
25  =>  25 + 12 + 6 + 3 + 1 = 47*/
public class HalvingSum {
    static int halvingSum(int n) {
        int sum = 0;
        while (n >= 1){
            sum += Math.floor(n);
            n /= 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(halvingSum(25));
        System.out.println(halvingSum(127));
    }
}
