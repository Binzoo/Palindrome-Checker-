import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to palindrome checker....");
        System.out.println("Please enter the word to check the letter: ");
        String letter = input.next();

        char[] revers = letter.toCharArray();
        StringBuilder reverseLetter = new StringBuilder();

        for (int i = 0; i < letter.length(); i++) {
            revers[i] = letter.charAt(letter.length() - i-1);
            reverseLetter.append(revers[i]);
        }
        if(letter.equals(reverseLetter.toString())){
            System.out.println("They are palindrome");
        }else {
            System.out.println("They are not palindrome");
        }
    }
}
