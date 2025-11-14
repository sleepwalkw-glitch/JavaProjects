import java.util.Arrays;

public class Job15 {
    static String[] minimum(int[] tab) {
        // first way : for each and with counters

        String[] result={"",""};
        int mini = tab[0];
        int position;
        int counter1 = 0;
        int counter2 = 0;
        for (int c : tab) {
            if (c < mini) {
                mini = c;
                counter1++;
            }
            counter2++;
        }
        position = counter2 - counter1;


        String phrase1 = "the minimum is " + mini;
        String phrase2 = "the position of the minimum is " + position;
        String[] results = {phrase1, phrase2};
        return results;


 /* the second way to find, with the method
            System.out.println(Arrays.stream(tab).min());

  */

/* the third way : for every
        int[] tab1 = {5, -3, 8, 2, -7, 4};
        int minimum1 = tab1[0];
        int position1 = 0;

        for (int j = 0; j < tab1.length; j++) {
            if (tab1[j] < minimum1) {
                minimum1 = tab1[j];
                position1 = j;
            }
        }
        System.out.println("the minimum is of " + minimum1);
        System.out.println("the position of the minimum is of " + position1);
*/

    }

    static void main(String[] args) {
        // recall the method with parameter  of array and with an instance of array,print the outcome in a loop of for each!
        int[] tab = {5, -3, 8, 2, -7, 4};
        for (String str : minimum(tab)) {
            System.out.println(str);
        }
    }
}

