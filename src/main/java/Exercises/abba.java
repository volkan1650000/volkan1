package Exercises;

public class abba {
    public static void main(String[] args) {
        int[]x = {4,2,3};
        System.out.println(trap(x));
    }
    public static int trap(int[] height) {
        int k = 0;
        int sum = 0;

        while(k<height.length-1){

            while(height[k]==0){
                k++;
            }

            if(k>=height.length-1){
                break;
            }

            boolean isGreater = false;

            while(!isGreater){
                for(int i = k+1; i<height.length; i++){
                    if(height[i]>=height[k]){
                        isGreater = true;
                    }
                }
                if(!isGreater){
                    k++;
                }
                if(k>=height.length-1){
                    break;
                }
            }

            int h = k;
            k++;

            if(k>=height.length-1){
                break;
            }

            while(height[h]>height[k]){
                sum+=height[h]-height[k];
                k++;
                if(k>=height.length-1){
                    break;
                }
            }
            System.out.println();
        }
        return sum;
    }
}
