import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String sentence = sc.nextLine();
        sentence = sentence.trim().replaceAll(" +", " ");
        String[] words = sentence.split(" ");

        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }

        double averageLength = (double) totalLength / words.length;

        System.out.println("Средняя длина слова: " + averageLength);
    }
}



