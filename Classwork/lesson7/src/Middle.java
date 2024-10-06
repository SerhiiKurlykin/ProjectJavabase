import java.util.Scanner;

public class Middle {

    public static String getMiddle(String input) {
        int length = input.length();


        if (length % 2 == 0) {

            return String.valueOf(input.charAt(length / 2 - 1));
        } else {

            return input.charAt(length / 2 - 1) + "" + input.charAt(length / 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();


        String middleCh = getMiddle(input);
        System.out.println("Middlesymbol: " + middleCh);
}}
