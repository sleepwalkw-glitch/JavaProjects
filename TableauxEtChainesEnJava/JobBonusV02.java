package TableauxEtChainesEnJava;

public class JobBonusV02 {
    public static void main (String[]args){
        /*
        exercise bonus v2
        Le programme lit un entier n en entrée.
        Il calcule la somme de tous les entiers strictement inférieurs à n
        qui sont multiples d'au moins un des nombres du tableaux : {4, 5, 7, 9, 11}.
        Exemple : pour l'entrée 16, la sortie doit être 95.
         */

        // first version
        int n=16;
        int somme=0;
        for (int i=1;i< n;i++){
            if(i%4==0||i%5==0||i%7==0||i%9==0||i%11==0){
                somme=somme+i;
              System.out.print(i);
              System.out.print(",");
            }
        }
        System.out.print(somme);
        System.out.println(" ");
        System.out.println("the second version is as below:");


        // version 2.0 :by using loop for each and with tableau
        int n1=16;
        int somme1=0;
        //int counter=0;
        int[] numbers={4,5,7,9,11};
        for(int j=1;j<n1;j++){
            for(int numbers1:numbers){
                if(j%numbers1==0){
                somme1=somme1+j;
                //counter++;
                System.out.println(j);
                }
            }
        }
        //System.out.println(counter);
        System.out.println(somme1);
    }

}
