//Write a program to find the best time to buy and sell stocks
public class buy_sell_stocks {
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
