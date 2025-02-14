import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] employeeIds = {104, 102, 109, 101, 107, 105};

        for (int i = 1; i < employeeIds.length; i++) {
            int key = employeeIds[i];
            int j = i - 1;

            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            employeeIds[j + 1] = key;
        }

        System.out.println(Arrays.toString(employeeIds));
    }
}
