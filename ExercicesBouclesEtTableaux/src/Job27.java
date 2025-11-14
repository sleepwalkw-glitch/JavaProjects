public class Job27 {
    static void compare(){
        int[] tab={1,2,3};
        int[] tab1={1,3,2};
        int a=tab.length;
        int b= tab1.length;
        boolean different=false;
        if(a!=b){
            //System.out.println("These two array are different!");
            different=true;
        }
        else {
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] != tab1[i]) {
                    different = true;
                    break;//if we chose to print inside the loop for, we can follow the print with an return so that it won't be print several times.
                }
            }
        }

        if(different){
            System.out.println("These two arrays are different!"); }
        else {
            System.out.println("They are the same!");}

        /* TODo :second way : to compare every value of two array in the array 2D within for enhanced loop, and use boolean to print
        int[][] tt1= { {1,2,3},{1,2,3}};
        boolean different=false;
        for (int[] t :tt1){
            for(int t1 : t){
                if(t!=tt1[0][0]){
                    different=true;
                   break;
                }
            }
        }
        if(true){
        System.out.println("These two arrays is different to each other");}

         */
        /* TODO:with a boolean, it works only for one situation, why?
        if(a!=b){
            System.out.println("These two array are different!");
        }
        else {
            boolean different=true;
            for(int i=0;i< tab.length;i++){
                if (tab[i]==tab1[i]) {
                    different=false;
                }
                else {
                    break;
                }
            }
            if(false){
                System.out.println("They are the same!");
            }
            else {
                System.out.println("These two arrays are different!");
            }
            */
    }
    static void main(String[] args) {
        compare();
    }
    //TODO: try another version with return as boolean
}
