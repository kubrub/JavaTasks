import java.util.Arrays;
import java.util.stream.Collectors;

/*Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
Return the resulting string.
Note: input will never be an empty string*/

public class FakeBinary {
        public static String fakeBin(String numberString) {
            return Arrays
                .stream(numberString.split(""))
                .map(s -> {
                    int value = Integer.parseInt(s);
                    return value < 5 ? "0" : "1";
                })
                .collect(Collectors.joining(""));
        }

    public static void main(String[] args) {
        String num = "366058562030849490134388085";
        System.out.println(fakeBin(num));
    }
}

/*    //Write Code
    int[] arr = new int arr[2];
    int[0] = 2*q[0]-p[0];
    intp[1] = 2*q[1]-p[1];
    return arr;*/