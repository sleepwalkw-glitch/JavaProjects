import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Job18 {

    static void numarray(){
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome! How many elements do you want to create in your Array?chose between 1 to 10");
        int choice= input.nextInt();
        if(choice<1||choice>10){
            System.out.println("invalid, enter a number between 1 and 10 please!");
            choice= input.nextInt();
        }
        else {
            System.out.println("enter the number one by one:");

            int[] nums = new int[choice];
            int index = 0;
//first way : for each loop for attribute the value and print the element ,or for each with for regular
            for (int n : nums) {
                nums[index]= input.nextInt();
                index++;
           }
 /*or use for regular to attribute the value for every element by indicating their index in the array
            for(int i=0;i<choice;i++){
            nums[i]=input.nextInt();}
             */
            for(int o:nums){
                System.out.println(o+" ");
            }
            //second way of print
            System.out.println(Arrays.toString(nums));}


/* seconde way : for regular
        int i=0;
            //loop for to enter the numbers
        for(i=0;i<choice;i++){
            nums[i]= input.nextInt();
        }
           //loop for to print the array : first way by print the elements ; second way to use Array.toString(nums)to print the whole array at once
        for(i=0;i<choice;i++){
            System.out.print(nums[i]+" ");
        }
        // seconde way of print
            System.out.println(Arrays.toString(nums));


            System.out.println();
        */
/* third way : use ArrayList with Scanner input
        ArrayList<Integer> nums = new ArrayList<Integer>(i);
        int i;
        for( i=0;i<choice;i++){
        nums.add(i,input.nextInt(i));}
        for( i=0;i<choice;i++){
        System.out.println(nums[i]+" ");*/
    }
    static void main(String[] args) {
        numarray();
    }

}


