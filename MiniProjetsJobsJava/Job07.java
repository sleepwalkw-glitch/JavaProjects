package MiniProjetsJobsJava;

public class Job07 {
    public static void main(String[] args) {
        int height=5;
        String a="*";
        String b="1";

        for(int j=1;j<=height;j++){
            for(int k=height;k>=j;k--){
            System.out.print(" ");}
            for (int i= 1; i <=j; i++){
                System.out.print(a);
            }
            for(int h=1;h<=j-1;h++){
                System.out.print(a);}
            System.out.println();
        }




    }
}
