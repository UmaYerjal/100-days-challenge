package Day88;

public class Buy_Two_Chocolates {
    public static void main(String[] args) {
        int prices[] = {1,2,2};
        int money = 3;
        System.out.println(buyChoco(prices, money));
    }
    public static int buyChoco(int[] prices, int money) {
        int n=prices.length;
        int ans =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    ans = Math.min(ans,prices[i]+prices[j]);
                }
            }
        }

        int num=money-ans;
        if(num>=0){
            return num;
        }
        return money;
    }
}
