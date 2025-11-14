public class Job25 {
    static void tempe(double[] result){
       /* can be structured in main part as parameter:
        double[] tempe={31,35,32,37,39,40,29};*/
        double sum=0;
        double moy;
        double min=result[0];
        double max=result[0];
        /*with for each, but when recalling the method with parameter,
        each value should be initialised,by calling the name of the parameter and initialised by the first index
         */
        for(double t : result){
            sum=sum+t;
            if(t<=result[0]){
                min=t;
            }
            else {
                max=t;
            }
        }
        moy= sum / result.length;
        System.out.println("the average temperature in this week is "+moy);
        System.out.println("the lowest temperature is "+min);
        System.out.println("the highest temperature is "+max);

    }
    static void main(String[] args) {
    // second way :to recall the method static void with parameter (double[] result)
      double[] array={35,32,37,39,40,29};
      tempe(array);
      /* first way : can be created as method without parameter and recalled only by the name
         tempe();*/

    }
}
