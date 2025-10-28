package Boucle;

import java.util.Scanner;

public class Boucle {
    public static  void main(String args[]) {

        System.out.println("Welcome to Boucle 'for' and 'while'");
        System.out.println("Let's start with the first Boucle: print the numbers from 1 to 10");
        int i;
        for(i=1;i<11;i++) {
            System.out.println(i);
        }

        int a=1;
        while(a<=10){
        System.out.println(a);
        a++;}

        System.out.println("Welcome to Boucle2 : print the numbers from 10 to 0");
        int b;
        for(b=10;b>=0;b--) {
            System.out.println(b);
        }

        int c=10;
        while( c>=0)
        {System.out.println(c);
        c--;}

        System.out.println("Welcome to Boucle3 : searching pair numbers within 20.");
        int d;
        for(d=0;d<=20;d++){
            if(d%2==0){
            System.out.println(d);}
        }

        int j=0;
        while(j<=20){
            if(j%2==0) {
                System.out.println(j);
            }
            j=j+1;
        }

         // for the case of print from 20 to 0 with while
         boolean run = true;
         int h=20;
         while(run){
            if(h % 2 == 0) {
                System.out.println(h);
            }
             h--;
            if (h < 0) {
                run = false;
            }
        }


        System.out.println("Welcome to Boucle4 : let's find the sum of the numbers from 1 to 100");
        int sum = 0;
        for ( int f = 1; f<= 100; f++) {
             sum = sum + f;
        }
        System.out.println("The sum is: " + sum);

    }
}
