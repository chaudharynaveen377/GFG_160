public class Kadanes_algorithm_day10 {
        static int[] dp;
        static int maxOverall;

        private static int helper(int[] arr, int i) {
            if (i == 0) return dp[i] = arr[0];
            if (dp[i] != Integer.MIN_VALUE) return dp[i];

            dp[i] = Math.max(arr[i], arr[i] + helper(arr, i - 1));
            maxOverall = Math.max(maxOverall, dp[i]);
            return dp[i];
        }

      static   int maxSubarraySum(int[] arr) {
            int n = arr.length;
            dp = new int[n];
            for (int i = 0; i < n; i++) dp[i] = Integer.MIN_VALUE;

            maxOverall = arr[0];
            helper(arr, n - 1);
            return maxOverall;
        }

    public static void main(String[] args) {
        int arr[]={3,5,2,7,5};
        System.out.println(maxSubarraySum(arr));
    }
    }


