package TableauxEtChainesEnJava;

public class Job01 {
    public static void main(String[] args) {
        int[] numbers={200,204,173,98,171,404,459};
        for(int number:numbers){
            if(number%2==0){
                System.out.println(number+" is a pair number.");
            }
            else{
                System.out.println(number+" is not a pair number.");
            }
        }

        /* for regular
        int[] number1={200,204,173,98,171,404,459};
        for(int i=0;i<=number1.length;i++)
            if(number1[i]%2==0){
                System.out.println(number1[i]+" is a pair number.");
            }
            else{System.out.println(number1[i]+" is a not pair number.");
            }
            */

    }
}
