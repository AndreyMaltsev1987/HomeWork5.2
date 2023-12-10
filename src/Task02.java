import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Задание 2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int num = 1;
        while (sb.length() < n) {
            sb.append(num);
            num++;
        }
        char digit = sb.charAt(n - 1);
        System.out.println("Цифра на позиции " + n + ": " + digit);
    }
}




