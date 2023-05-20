package whole;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int counter = 9;
        List<String> lines = new ArrayList<String>();
        for(int i = 1; i<10;i++){
            lines.add(String.valueOf(i));
        }
        int l = 0;
        int birbir = 0;
        int dirdir = 0;
        do{
            if(counter==9){
                System.out.println("First turn is yours");
            }else{
                System.out.println("Its now your turn");
            }


            for(int i = 0; i<3; i++) {
                if(lines.get(i).equals("x") || lines.get(i).equals("o")) {
                    System.out.print(lines.get(i));
                    if (i != 2) {
                        System.out.print("|");
                    }
                }else{
                    System.out.print(" ");
                    if (i != 2) {
                        System.out.print("|");
                    }
                }
            }
            System.out.println();
            System.out.println("-+-+-");
            for(int i = 3; i<6; i++){
                if(lines.get(i).equals("x") || lines.get(i).equals("o")) {
                    System.out.print(lines.get(i));
                    if (i != 5) {
                        System.out.print("|");
                    }
                }else{
                    System.out.print(" ");
                    if (i != 5) {
                        System.out.print("|");
                    }
                }
            }
            System.out.println();
            System.out.println("-+-+-");
            for(int i = 6; i<9; i++){
                if(lines.get(i).equals("x") || lines.get(i).equals("o")) {
                    System.out.print(lines.get(i));
                    if (i != 8) {
                        System.out.print("|");
                    }
                }else{
                    System.out.print(" ");
                    if (i != 8) {
                        System.out.print("|");
                    }
                }
            }

            System.out.println();


            int count = 0;
            int h = 0;
            do{
                if(count>0){
                    System.out.println("That spot is occupied already");
                }
                h=scan.nextInt()-1;
                count++;
            }while(lines.get(h).equals("x")||lines.get(h).equals("o"));
            lines.set(h,"x");
            counter--;

            for(int i = 0; i<3;i++){
               if(lines.get(i).equals(lines.get(i+3))   &&   lines.get(i+6).equals(lines.get(i))){
                   dirdir++;
               }
            }
            for(int k = 0; k<7; k=k+3){
                if(lines.get(k).equals(lines.get(k+1)) && lines.get(k+2).equals(lines.get(k))){
                    dirdir++;
                }
            }
            for(int q = 0; q<3;q=q+2){
                if(q==0){
                    if(lines.get(q).equals(lines.get(q+4))&&lines.get(q).equals(lines.get(q+8))){
                        dirdir++;
                    }
                }else{
                    if(lines.get(q).equals(lines.get(q+2))&&lines.get(q).equals(lines.get(q+4))){
                        dirdir++;
                    }
                }
            }
            if(dirdir>0){
                break;
            }
            if(counter==0){
                break;
            }
           do{
               l = random.nextInt(9);
           }while(lines.get(l).equals("x")||lines.get(l).equals("o"));
           lines.set(l,"o");
            System.out.println("Computer played");
            for(int i = 0; i<3;i++){
                if(lines.get(i).equals(lines.get(i+3))   &&   lines.get(i+6).equals(lines.get(i))){
                    birbir++;
                }
            }
            for(int k = 0; k<7; k=k+3){
                if(lines.get(k).equals(lines.get(k+1)) && lines.get(k+2).equals(lines.get(k))){
                    birbir++;
                }
            }
            for(int q = 0; q<3;q=q+2){
                if(q==0){
                    if(lines.get(q).equals(lines.get(q+4))&&lines.get(q).equals(lines.get(q+8))){
                        birbir++;
                    }
                }else{
                    if(lines.get(q).equals(lines.get(q+2))&&lines.get(q).equals(lines.get(q+4))){
                        birbir++;
                    }
                }
            }
            if(birbir>0){
                break;
            }
            if(counter==0){
                break;
            }
            counter--;
        }while(0<counter);
        for(int i = 0; i<3; i++) {
            if(lines.get(i).equals("x") || lines.get(i).equals("o")) {
                System.out.print(lines.get(i));
                if (i != 2) {
                    System.out.print("|");
                }
            }else{
                System.out.print(" ");
                if (i != 2) {
                    System.out.print("|");
                }
            }
        }
        System.out.println();
        System.out.println("-+-+-");
        for(int i = 3; i<6; i++){
            if(lines.get(i).equals("x") || lines.get(i).equals("o")) {
                System.out.print(lines.get(i));
                if (i != 5) {
                    System.out.print("|");
                }
            }else{
                System.out.print(" ");
                if (i != 5) {
                    System.out.print("|");
                }
            }
        }
        System.out.println();
        System.out.println("-+-+-");
        for(int i = 6; i<9; i++){
            if(lines.get(i).equals("x") || lines.get(i).equals("o")) {
                System.out.print(lines.get(i));
                if (i != 8) {
                    System.out.print("|");
                }
            }else{
                System.out.print(" ");
                if (i != 8) {
                    System.out.print("|");
                }
            }
        }
        System.out.println();

        if(birbir>0){
            System.out.println("Computer won!");
        }
        else if(dirdir>0){
            System.out.println("You won!");
        }
        else if(counter==0){
            System.out.println("Draw..");
        }
    }
}
