import java.util.ArrayList;
import java.util.Scanner;

public class Job17 {
    public static void counters(){
        int[] tab1={2,3,-8,9,0,-10,-23,0,-7,10};
    /* put in a group of value for an Array, two way of doing, first by scanner with for loop; the second is to use Scanner with arraylist method
        Scanner input= new Scanner(System.in);
        //use ArrayList<Integer> with scanner to put in the elements by indicating their index or not
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(0,input.nextInt());
        list.add(1,input.nextInt());
        //two way :to use scanner with arraylist, the first is to indicate all the value by entering with their index;
        // the second way is put the input.nextInt() in the arraylist method of list.add() as an object
        list.add(input.nextInt());

     */
/*the second way to ask the user to tape the integer number by using loop for
        int[] tab1= new int[10];
        for(int j=0;j < 10;j++){
            tab1[j] = input.nextInt();
        }
 */

        int counter1=0;
        int counter2=0;
        int counter3=0;

        for(int t : tab1){
            if(t<0){
                counter1++;
            } else if (t>0) {
                counter2++;
            }
            else {
                counter3++;
            }
        }
        System.out.println("In this array,there are "+counter1+" negative numbers "+counter2+" positive numbers "+counter3+" numbers equal to 0.");

    }
    static void main(String[] args) {
        counters();
//TODO: to use the method with return, or just enter the array in class main,but not only void
    }
}
