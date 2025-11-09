package TableauxEtChainesEnJava;

import java.util.Arrays;


public class Job02 {

    public static void main(String[] args) {

        // first way : for each
        String str1="Tous ces instants seront perdus dans le temps comme les larmes sous la pluie.";
        char[] chars = str1.toCharArray();
        int count=1;
        for (char c:chars){
            if(count % 2!=0){
                System.out.print(c);
            }
            count++;
        }

        //second way : for regular , but to print only the index of the characters in the position of non-pair number

    }
}
