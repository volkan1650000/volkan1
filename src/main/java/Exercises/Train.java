package Exercises;
import java.util.ArrayList;
import java.util.List;

public class Train{
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiralOrder(matrix));

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> vay = new ArrayList<>();
        List<Integer> vay2 = new ArrayList<>();
        int counter = 0;
        int count = 0;
        vay.add(matrix[counter][count]);
        int w = 0;
        int l = matrix[0].length* matrix.length;
        vay2.add(counter*10+count);
        while(w<l && vay.size() < l){
            while(count+1<matrix[0].length && !vay2.contains((counter*10)+count+1)){
                vay.add(matrix[counter][count+1]);
                vay2.add(counter*10+count);
                count++;
                w++;
            }
            while(counter+1< matrix.length && !vay2.contains((counter+1)*10+count)){
                vay.add(matrix[counter+1][count]);
                vay2.add(counter*10+count);
                counter++;
                w++;
            }
            while(count-1>=0 && !vay2.contains((counter*10)+count-1)){
                vay.add(matrix[counter][count-1]);
                vay2.add(counter*10+count);
                count--;
                w++;
            }
            while(counter-1>=0 && !vay2.contains((counter-1)*10+count)){
                vay.add(matrix[counter-1][count]);
                vay2.add(counter*10+count);
                counter--;
                w++;
            }
        }
        return vay;
    }
}

