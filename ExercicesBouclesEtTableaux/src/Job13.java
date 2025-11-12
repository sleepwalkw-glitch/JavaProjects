import java.util.ArrayList;

public class Job13 {
    public static void arraydouble(){
        int[] tab1={2,5,3,8,1};
        int[] tab2= new int[5];
        //first way : with for each
        for(int i=0;i< tab1.length;i++){
            tab2[i]=tab1[i]*2;
            System.out.print(tab2[i]+" ");
        }
        System.out.println(" ");

/* second way : with arraylist method add and get
        ArrayList<Integer> tab3= new ArrayList<Integer>(5);
        for(int j=0;j< tab1.length;j++){
        tab3.add(j,(2*tab1[j]));
        System.out.println(tab3.get(j));}

         */
    }
    static void main(String[] args) {
       arraydouble();

    }
}

//TODO: use the method with return and print the both of the table
