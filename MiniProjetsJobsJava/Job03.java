package MiniProjetsJobsJava;

public class Job03 {
    public static void main(String[] args) {

        int a;
        for(a=0;a<=100;a++){
            if(a>=0&&a<=20){
                System.out.println(a+"_.");
            }

            if(a>=25&&a<=50){
                if(a==42){
                    System.out.println("'La Plateforme_.'");
                    continue;}
                System.out.println(a+"___.");
            }

            if(a>50){
                System.out.println(a);
            }

        }
    }
}
