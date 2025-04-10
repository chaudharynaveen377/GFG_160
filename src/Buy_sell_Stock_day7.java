public class Buy_sell_Stock_day7 {
    static int logic(int arr[]){
        int x=0;
        int y=1;
        int sum=0;
        while (y<arr.length){
            sum=Math.max(sum,sum+(arr[y]-arr[x]));
            y++;x++;
        }
        return sum;
    }
    public static void main(String[] args) {
//        Input: prices[] = [100, 180, 260, 310, 40, 535, 695]
//Output: 865
int arr[]={4,2,2,2};
        System.out.println(logic(arr));
    }
}
