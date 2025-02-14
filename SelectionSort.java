import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] scores = {78, 92, 85, 66, 89, 75};
        selectionSort(scores);
        System.out.println(Arrays.toString(scores));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
