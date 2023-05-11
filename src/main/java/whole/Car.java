package whole;

import java.util.Arrays;

public class Car{
    public static void main(String[] args) {
        int[]nums1 = {1,5};
        int[]nums2 = {10};
        int[]ye = new int[nums1.length+nums2.length];
        int counter = 0;
        for(int w : nums1){
            ye[counter]=w;
            counter++;
        }
        for(int w : nums2){
            ye[counter]=w;
            counter++;
        }
        Arrays.sort(ye);
        //
        int g = ye.length;

        if(g%2==0){
            double a = ye[g/2]+ye[g/2-1];
            System.out.println(a/2);
        }else{
            double b = ye[(g-1)/2];
            System.out.println(b);
        }
    }
}
