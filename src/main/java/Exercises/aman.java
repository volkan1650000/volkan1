package whole;

public class aman {
    public static void main(String[] args) {
        int[]a = {10,9,8,7,6,5,4,3,2,1,1,0};
        System.out.println(jump(a));
    }
    public static int jump(int[] nums) {

        int index = 0;
        int counter = 0;

        while(true){

            if(nums.length==1){
                break;
            }

            int counterh = 0;
            counter++;
            int x = nums[index];
            int max = 0;
            while(x>=nums.length-index){
                x--;
            }
            int top = 0;
            for(int i = 1; i<=x; i++){
                counterh++;
                top = index+counterh;
                max = Math.max(max,nums[index+i]+top);
            }
            int bidakka = 0;
            for(int i = counterh+index; i>index; i--){
                if(i==nums.length-1){
                    bidakka++;
                    break;
                }
                if(nums[i]+i==max){
                    index = i;
                    break;
                }
            }
            if(bidakka>0){
                break;
            }
            if(index>=nums.length-1){
                break;
            }
        }
        return counter;
    }
}
