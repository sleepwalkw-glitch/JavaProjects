public class Job24 {
    static void pairornon(int[] result){

        int counter0=0;
        int counter1=0;
        for(int p : result){
            if (p%2==0){
                counter0++;
            }
            else {
                counter1++;
            }
        }
        System.out.println("There are "+counter0+" pair numbers.");
        System.out.println("There are "+counter1+" non pair numbers");
    }
    static void main(String[] args) {
        int[] r={1,3,2,4,5,7,4,6,9,11,8,10,12,15,13};
        pairornon(r);
    }
}
