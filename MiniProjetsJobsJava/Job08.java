package MiniProjetsJobsJava;

public class Job08 {
    public static void main(String[] args) {
        int height=5;
        String a="*";

        for (int k=1;k<=height;k++) {
            for(int i=height;i>=k;i--){
                System.out.print(" ");
            }
            for(int h=1;h<=k;h++) {
                System.out.print(a);
            }
            for(int j=1;j<=k-1;j++) {
                System.out.print(a);}

            System.out.println();
        }
        for (int x=1;x<=height;x++) {
            for(int y=1;y<=x;y++) {
            System.out.print(" ");}
            for(int z=height;z>=x;z--) {
                System.out.print(a);
            }
            for(int z=height;z>x;z--) {
                System.out.print(a);}
            System.out.println();
        }
    }
}
