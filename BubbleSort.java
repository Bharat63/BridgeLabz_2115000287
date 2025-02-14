import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] marks = {85, 72, 90, 66, 88, 79};
        
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(marks));
    }
}
