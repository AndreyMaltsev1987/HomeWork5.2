import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Задание 10");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        if (input.length() > 50) {
            System.out.println("Максимальная длина строки - 50 символов");
            return;
        }
        int n = input.length();
        for (int i = 0; i < n; i++) {
            System.out.println(input.substring(0, i + 1));
        }
        for (int i = n - 2; i >= 0; i--) {
            System.out.println(input.substring(0, i + 1));
        }
    }
}




