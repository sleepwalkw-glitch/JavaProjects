public class Job26 {
    static void grade(int[] result){
        int counter1=0,counter2=0,counter3=0,counter4=0;
        for(int n : result){
            if(n>=16){
                counter1++;
            } else if (n>=12) {
                counter2++;
            } else if (n>=10) {
                counter3++;
            }else {
                counter4++;
            }
        }
        System.out.println(counter1+" scored as 'very good'."+counter2+" scored as 'good'."+counter3+" scored as 'pass'."+counter4+" scored as 'failed'.");
    }
    static void main(String[] args) {
        int[] array={25,17,13,15,14,11,9,3,6,10};
        grade(array);
    }
}
