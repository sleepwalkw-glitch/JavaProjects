package TableauxEtChainesEnJava;
public class Job05 {
    public static void main(String[] args) {
        String str = "On n’est pas le meilleur quand on le croit mais quand on le sait.";

        String[] char_voyelles = {"a", "e", "i", "o", "u","y","A", "E", "I", "O", "U","Y"};
        int counterV = 0;
        int counterC = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetter(c)) {
                boolean isVowel = false;

                for (String v : char_voyelles) {
                    if (c == v.charAt(0)) {
                        isVowel = true;
                        counterV++;
                        break;
                    }
                }
                if (!isVowel) {
                    counterC++;
                }
            }
        }

        System.out.println("Vowels: " + counterV);
        System.out.println("Consonants: " + counterC);
        System.out.println();

        //second version : can be replaced by for each


        String str1 = "On n’est pas le meilleur quand on le croit mais quand on le sait.";
        char[] char_voyelles1 = {'a', 'e', 'i', 'o', 'u','y','A', 'E', 'I', 'O', 'U','Y'};
        int counterV1 = 0;
        int counterC1 = 0;
        for(char c1:str1.toCharArray()){
            if(c1==' '||c1==','||c1=='\'') {
                continue;
            }
            boolean isVoyelle1=false;
            for(char voyelle1 : char_voyelles1){
                if(c1 == voyelle1){
                    isVoyelle1=true;
                    break;
                }
            }
            if(isVoyelle1){
                counterV1++;
            }
            else{
                counterC1++;
            }
        }
        System.out.println("Voyelles:"+counterV1);
        System.out.println("Consonnes:"+counterC1);

    }
}

