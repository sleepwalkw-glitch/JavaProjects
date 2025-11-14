import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Job22 {
    static void tableau(){
        int[] tab={1,4,9,16,25};
        int[] tab1=new int[tab.length];
        //first way : for regular with Arrays.toString()
        for(int i=0;i< tab.length;i++){
            tab1[i]=tab[i];
        }
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(tab1));


/* second way : for each with index
        int index=0;
        for(int n:tab){
            tab1[index]=n;
            index++;
        }
        for(int p:tab){
            System.out.print(p);
        }
        System.out.println();
        for (int p1:tab){
            System.out.print(p1);
        }
 */
/*the third way:create an ArrayList and with method of .add(index,value) to create a new array and print it out
        ArrayList<Integer> tab2= new ArrayList<Integer>(tab.length);
        for(int j=0;j< tab.length;j++){
            tab2.add(j,tab[j]);
        }
        for(int j=0;j<tab.length;j++){
        System.out.print(tab[j]+" ");}
        System.out.println();
        System.out.println(tab2);

         */

    }
    static void main(String[] args) {
        tableau();
    }

//TODO: use method with return and to print in an array 2D

//    public static int[][] duplicate(int[] base){
//        int[] duplicate= new int[base.length];
//        for()}



}
