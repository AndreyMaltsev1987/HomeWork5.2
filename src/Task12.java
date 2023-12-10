public class Task12 {
    public static void main(String[] args) {
        System.out.println("Задание 12");

        String text = ":) ;---------[[[[[[[[ :-)] ;-- -) ::-( :-()";
        int count = countSmileys(text);
        System.out.println("Количество смайликов: " + count);
    }

    public static int countSmileys(String text) {
        int count = 0;
        int index = 0;

        while (index < text.length()) {
            if (text.charAt(index) == ';' || text.charAt(index) == ':') {
                index++;
                while (index < text.length() && text.charAt(index) == '-') {
                    index++;
                }
                if (index < text.length() && isSmileyEnd(text.charAt(index))) {
                    count++;
                }
            }
            index++;
        }

        return count;
    }

    public static boolean isSmileyEnd(char c) {
        return c == '(' || c == ')' || c == '[' || c == ']';
    }
}



