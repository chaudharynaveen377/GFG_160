import java.util.ArrayList;
import java.util.Arrays;

public class Maximum_Product_Subarray_day11 {
  static  int maxProduct(int[] arr) {

        int leftProduct = 1;
        int rightProduct = 1;
        int ans =  arr[0];
        for(int i=0;i<arr.length;i++){
            if(leftProduct==0){
                leftProduct=1;
            }
            if(rightProduct==0){
                rightProduct=1;
            }
            leftProduct = leftProduct * arr[i];
            rightProduct = rightProduct * arr[arr.length-i-1];
            ans  = Math.max(ans,Math.max(leftProduct,rightProduct));
        }
        return ans;


    }
    public static void main(String[] args) {
        int arr[]={5,4,0,9,11};
        System.out.println(maxProduct(arr));
    }

}



//    Input: arr[] = [-2, 6, -3, -10, 0, 2]
//    Output: 180
//    Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180.
