public class Minimize_Heights_lI_day9 {

    static int logic(int arr[],int i,int min,int max,int k){
        if (i>=arr.length){
            return max-min;
        }
        int left=logic(arr,i+1,Math.min(min,arr[i]+k),Math.max(min,arr[i]+k),k);
        int right=logic(arr,i+1,Math.min(min,arr[i]-k),Math.max(min,arr[i]-k),k);
   return Math.min(left,right);
    }
    public static void main(String[] args) {
//        Input: k = 2, arr[] = {1, 5, 8, 10}
//Output: 5
//Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.
// The difference between the largest and the smallest is 8-3 = 5.
        int arr[]={1 ,8 ,10, 6, 4, 6, 9, 1};int k=7;
        System.out.println(logic(arr,0,Integer.MAX_VALUE,Integer.MIN_VALUE,k));
    }
}
