import java.util.*;

class PairWithGivenSum {

    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> visitedNumbers = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (visitedNumbers.contains(complement)) {
                return true;
            }

            visitedNumbers.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 2, 3, 5, 7, 1 };
        int target = 8;

        if (hasPairWithSum(arr, target)) {
            System.out.println("Pair with sum " + target + " exists.");
        } else {
            System.out.println("No pair with sum " + target + " exists.");
        }
    }
}
