import java.util.Scanner;

public class Ex2 {
    public static String secondWordInArray(String[] words) {
        String aux;
        for (int k = 0; k < words.length - 1; k++) {
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].compareTo(words[i + 1]) > 0) {
                    aux = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = aux;
                }
            }
        }
     return words[1];
    }

    public static String lastButOneInArray(String[] words) {
        String aux;
        for (int k = 0; k < words.length - 1; k++) {
            for (int i = 0; i < words.length - 1 - k; i++) {
                if (words[i].compareTo(words[i + 1]) > 0) {
                    aux = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = aux;
                }
            }
        }
        return words[words.length - 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String[] words = new String[number];

        for (int i = 0; i < words.length; i++) {
            words[i] = sc.next();
        }
        System.out.println(secondWordInArray(words));
        System.out.println(lastButOneInArray(words));
    }
}
