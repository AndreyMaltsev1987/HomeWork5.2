import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        System.out.println("Отобранные слова:");
        for (String word : words) {
            if (startsWithVowel(word) && endsWithConsonant(word)) {
                System.out.println(word);
            }
        }
    }
    public static boolean startsWithVowel(String word) {
        String firstLetter = word.substring(0, 1);
        return firstLetter.matches("[aeiouAEIOU]");
    }

    public static boolean endsWithConsonant(String word) {
        String lastLetter = word.substring(word.length() - 1);
        return lastLetter.matches("[^aeiouAEIOU\\W]");
    }
}




