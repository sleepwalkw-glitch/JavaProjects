package TableauxEtChainesEnJava;

public class Job04 {
//first way by for regular and if

    public static void main(String[] args) {
        String str="Dans l'espace, personne ne vous entend crier.";

        char[] c = str.toCharArray();
        int somme = 0;
        for(int i= 0; i<c.length; i++)
        {
            System.out.print(c[i]);
            if( c[i] != ' ' && c[i] != ',' && c[i] != '\'' && c[i] != '.' ) {
                somme++;
            }

        }
        System.out.println("The total number of characters in this phrase is "+somme);
        System.out.println();

// The second way by indicating all outcomes to checking out witch characters have been part off

        System.out.println("the second way to do it is as follow:");

        String str1="Dans l'espace, personne ne vous entend crier.";
        char[] chars=str1.toCharArray();
        int counterschars=0;
        int counterletters=0;
        int counternoletters=0;

        for(int i=0;i<str1.length();i++) {
            System.out.println("characters in the string are:" + str1.charAt(i));
            counterschars++;
            if (Character.isLetter(chars[i])) {
                System.out.println("letters in the array of character are:" + chars[i]);
                counterletters++;
            }else { System.out.println("others are:"+chars[i]);counternoletters++;}

        }
        System.out.println(counterletters);
        System.out.println(counterschars);
        System.out.println(counternoletters);
        System.out.println(str1.length());
    }

}
