import java.util.Arrays;

public class Job23 {
    static void carre(){
        int[] carre=new int[10];
        for(int i=1;i<=10;i++){
            carre[i-1]=Math.powExact(i,2);
        }
        //first way to print
        System.out.println(Arrays.toString(carre));
        //second way to print
        for(int i=1;i<=10;i++){
            System.out.println(carre[i-1]);
        }
    }
    static void main(String[] args) {
        carre();
    }
}
