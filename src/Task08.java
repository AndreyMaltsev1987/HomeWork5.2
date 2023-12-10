import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        System.out.println("Задание 8");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите идентификатор переменной: ");
        String identifier = sc.nextLine();
        String convertedIdentifier;
        if (isJavaIdentifier(identifier)) {
            convertedIdentifier = convertToCppIdentifier(identifier);
        } else if (isCppIdentifier(identifier)) {
            convertedIdentifier = convertToJavaIdentifier(identifier);
        } else {
            System.out.println("Идентификатор имеет смешанный синтаксис");
            return;
        }
        System.out.println("Преобразованный идентификатор: " + convertedIdentifier);
    }
    public static boolean isJavaIdentifier(String identifier) {
        return identifier.matches("[a-z][a-zA-Z0-9]*");
    }
    public static boolean isCppIdentifier(String identifier) {
        return identifier.matches("[a-z_][a-z0-9_]*");
    }
    public static String convertToCppIdentifier(String identifier) {
        String[] words = identifier.split("(?=[A-Z])");
        StringBuilder cppIdentifier = new StringBuilder();
        for (String word : words) {
            cppIdentifier.append(word.toLowerCase()).append("_");
        }
        return cppIdentifier.substring(0, cppIdentifier.length() - 1);
    }
    public static String convertToJavaIdentifier(String identifier) {
        String[] words = identifier.split("_");
        StringBuilder javaIdentifier = new StringBuilder();
        for (String word : words) {
            javaIdentifier.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
        }
        return javaIdentifier.toString();
    }
}

