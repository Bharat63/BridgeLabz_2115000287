import java.util.Scanner;

public class FrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        char mostFrequentChar = findMostFrequentChar(str);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }

    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; // Array to store frequency of each character
        int maxFreq = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++; // Increase count of the character

            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                mostFrequent = ch;
            }
        }
        return mostFrequent;
    }
}
