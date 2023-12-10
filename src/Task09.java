import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("Задание 9");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        String cleanStr1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String cleanStr2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] charArray1 = cleanStr1.toCharArray();
        char[] charArray2 = cleanStr2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean isAnagram = Arrays.equals(charArray1, charArray2);
        if (isAnagram) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}




