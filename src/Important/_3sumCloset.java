package Important;

public class _3sumCloset {
    static int solve(int arr[], int i, int count, int sum, int target){
        if (count == 3){
            if (sum <= target) return sum;
            else return Integer.MIN_VALUE;
        }
        if (i >= arr.length){
            return Integer.MIN_VALUE;
        }

        // Include current element
        int left = solve(arr, i + 1, count + 1, sum + arr[i], target);

        // Exclude current element
        int right = solve(arr, i + 1, count, sum, target);

        // Return the better (maximum valid) option
        return Math.max(left, right);
    }

    public static void main(String[] args) {
        int arr[]={-1,2,1,-4};
        System.out.println(solve(arr,0,0,0,1));

    }
}
