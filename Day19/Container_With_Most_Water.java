public class Container_With_Most_Water {
    public static void main(String[] args) {
        int height[] ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int MaxWater=0;
        int lp=0;
        int rp=height.length-1;
        while(lp<rp){
            int ht = Math.min(height[lp],height[rp]);
            int weight=rp-lp;
            int currentWater = ht*weight;
            MaxWater=Math.max(currentWater,MaxWater);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return MaxWater;
    }

}

