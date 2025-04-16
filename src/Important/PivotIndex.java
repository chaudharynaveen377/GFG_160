package Important;

public class PivotIndex {
    static int solve(int arr[]){
        int leftSum=0;
        int rightSum=0;
        int i=0,j=arr.length-1;
        while (i<j){
            if (leftSum<rightSum){
                leftSum=leftSum+arr[i];
                i++;
            }
            if (rightSum<leftSum){
                rightSum=rightSum+arr[j];
                j--;
            }
            if (leftSum==rightSum ){
                if (i==j){
                    return i;
                }else {
                    leftSum=leftSum+arr[i];
                    rightSum=rightSum+arr[j];
                    i++;
                    j--;
                }

            }

        }
        return -1;
    }
    static int recursive(int arr[],int leftSum,int rightSum,int i,int j){
        if (i>j){
            return -1;
        }
        if (leftSum==rightSum){
            if (i==j){
                return i;
            }
            else {
              leftSum= leftSum+arr[i];
              rightSum=rightSum+arr[j];
              i=i+1;
              j=j-1;
            }
        }
        if (leftSum<rightSum){
           return recursive(arr,leftSum+arr[i],rightSum,i+1,j);
        }

        return recursive(arr,leftSum,rightSum+arr[j],i,j-1);

    }
    public static void main(String[] args) {
        int arr[]={1,7,3,6,5,6};
        System.out.println(solve(arr));
        System.out.println(recursive(arr,0,0,0,arr.length-1));
    }
}
