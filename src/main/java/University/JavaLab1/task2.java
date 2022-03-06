import java.util.Scanner;

public class task2 {
        public static void main(String[] args) {
            char s = 'h';
            String str;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input line dropped by ,");
            str = scanner.nextLine();

            scanner.close();

            String[] words = str.split(",");

            for (int i = 0; i < words.length; i++) {
                char[] letters = words[i].toCharArray();
                words[i] = "";
                for (int j = 0; j <= letters.length - 1; j++) {
                    if(letters[j] == 't'){
                        words[i] += letters[j];
                        words[i] += s;
                    }
                    else words[i] += letters[j];
                }
            }

            for (String word : words) {
                System.out.print(word + " ");
            }
        }
}