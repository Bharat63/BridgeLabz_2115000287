import java.util.*;

class SubarraysWithZeroSum {

    public static void findSubarraysWithZeroSum(int[] arr) {
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int cumulativeSum = 0;

        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];

            if (cumulativeSum == 0) {
                System.out.println("Subarray from index 0 to " + i);
            }

            if (sumMap.containsKey(cumulativeSum)) {
                List<Integer> indices = sumMap.get(cumulativeSum);
                for (int index : indices) {
                    System.out.println("Subarray from index " + (index + 1) + " to " + i);
                }
            }

            sumMap.putIfAbsent(cumulativeSum, new ArrayList<>());
            sumMap.get(cumulativeSum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, -2, -1, 3, 4, -7, 3, 1, 2, -5 };
        findSubarraysWithZeroSum(arr);
    }
}
