//Write a program to find the best time for buying and selling stocks
//In MAIN- enter prices
//In FUNCTION- buy=Integer_MAX_VALUE compare that with array[i] calculate profit and compare with max profit

public class array_buy_sell_stocks {
    public static int buy_sell(int array[]){
        int buy=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>buy){
              int profit=array[i]-buy;
              maxprofit=Math.max(maxprofit,profit);
            }else{
                buy=array[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int array[]={7,6,4,3,1};
        System.out.println(buy_sell(array));
    }
}
