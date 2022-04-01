import java.util.Scanner;

public class Search {
    static Scanner sc = new Scanner(System.in);
    static char operation;
    static char[] charArray;

    public static void searchOperator() {
        System.out.println("Enter your arithmetic expression:");
        String input = sc.nextLine().replaceAll("\\s+", "");
        charArray = new char[input.length()];
        for (int i = 0;i < input.length(); i++) {
            charArray[i]= input.charAt(i);
            if (charArray[i] == '+') {
                operation = '+';
            }
            if (charArray[i] == '-') {
                operation = '-';
            }
            if (charArray[i] == '*') {
                operation = '*';
            }
            if (charArray[i] == '/') {
                operation = '/';
            }
        }
    }
}
