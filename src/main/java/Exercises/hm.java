package Exercises;

public class hm {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {

        int z = 1;

        if(x<0){
            z = -1;
        }else if(x>Integer.MAX_VALUE){
            z=0;
        }

        x = Math.abs(x);

        int length = String.valueOf(x).length();

        int h = 1;

        for(int j = 1; j<length; j++){
            h = h*10;
        }

        int d = 0;

        for(int i = x; i>0; i=i/10){
            int rakam = i%10;
            d+=rakam*h;
            h=h/10;
        }
        return d*z;
    }
}
