import java.util.Arrays;

public class Job28 {
    static void second(){
        //first way to use new int[],second way is to use ArrayList with add

        int[] base={1,2,3,4,5,6,7,8,9,10,11,12};
        int index=0;
        for(int t : base){
            if(t%2==0) {
                index++;}
        }
        //initialise by creating a counter before this one
        int[] second= new int[index];
        System.out.println(index);
        int i=index;
        for(int t : base){
            if(t%2==0){
                second[index-i]=t;
                i--;}
        }
        System.out.println(Arrays.toString(second));

        /* TODO:
            the second way : with ArrayList
            ArrayList<Interger> pair= new ArrayList<>();
            */
    }

    static void main(String[] args) {
        second();
    }
}
