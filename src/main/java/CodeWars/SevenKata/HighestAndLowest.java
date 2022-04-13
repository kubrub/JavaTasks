package CodeWars.SevenKata;

import java.util.ArrayList;
import java.util.Collections;

/*
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
*/

public class HighestAndLowest {

    public static String HighAndLow(String numbers) {
        String[] num = numbers.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(String s : num){
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);

        return list.get(list.size() - 1) + " " + list.get(0);
    }


    public static void main(String[] args) {
        System.out.println(HighAndLow("1 2 3"));
    }
}
