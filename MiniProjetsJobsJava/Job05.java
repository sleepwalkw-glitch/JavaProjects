package MiniProjetsJobsJava;

public class Job05 {
    public static void main(String[] args) {
        for (int a=2;a<=1000;a++){
            boolean isPrime=true;

            double n=(int)Math.sqrt(a);
            for(int i=2;i<=n;i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)System.out.println(a);
        }











    }
}
