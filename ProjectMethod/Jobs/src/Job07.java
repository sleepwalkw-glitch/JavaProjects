import java.util.Scanner;

public class Job07 {
    //the first method
    public static String gras(String str) {
        //the first way
        String result = "";
        String[] split = str.split(" ");

        char[][] splitArrays = new char[split.length][];

        for (int i = 0; i < split.length; i++) {
            splitArrays[i] = split[i].toCharArray();
        }
        for (char[] cs : splitArrays) {
            if (Character.isUpperCase(cs[0])) {
                result += "*";
                result += String.valueOf(cs);
                result += "*";
            } else {
                result += String.valueOf(cs);
            }
            result += " ";
        }
        return result;
/*
//the second way, with String method String.isEmpty()

        String result=" ";
        String[] word= str.split(" ");
        for (String c: word){
            //if(c!='\\'||c!='''||c!='.'), to use the String method : !.isEmpty
            //to verify the letters by its index weather they are uppercase or lowercase, we can use method Character.isUpperCase(c.charAt(i))
            if(!c.isEmpty() && Character.isUpperCase(c.charAt(0))){
                result +="*"+c+"*";
            }
            else {
                result += c;
            }
            result+=" ";
        }
        return result.trim();
 */
    }

    //the second method, that means to change the numeric value of the letters, watch out the unicode of letters  in systemACSII8 is from 65 to 90(for Uppercase)and from 97 to 122(fot Lowercase)
    public static String cesar(String str) {
//the first way
        String result = "";
        char[] strtochar = str.toCharArray();// str.toCharArray()
        for (char stc : strtochar) {
            if (Character.isLetter(stc)) {
                char base = Character.isUpperCase(stc) ? 'A' : 'a';
                stc = (char) ((stc - base + 2) % 26 + base);
            }
            result += stc;
        }
        return result;

/* the second way
    public static String cesar(String str, int decalage){
    char[] chars= str.toCharArray();
    String test ="";
    for(char c : chars){
        if (Character.isLetter(c)){
        int sumofChars = c +decalage;
        if(Character.isUpperCase(c)&&sumofChars>90){continue;}
        if(Character.isLowerCase(c)&&sumofChars>122){
        test +=(char)((c-26)+decalage);
        continue;}
        test +=(char)(c + decalage);}
        else {test +=c;}
    }
    return test;
 */

    }


    // the third method
    public static String plateforme(String str) {
        String result = "";
        String[] wordarray = str.split(" ");
        for (String w : wordarray) {
            if (w.endsWith("me")) {
                result += w + "_";
            } else {
                result += w;
            }
            result += " ";
        }
        return result;
        // the second way of doing
        /*
        String[] wordarray1=str.split(" ");
        String result="";
        for(String w :wordarray1.toCharArray()){
         if(w.length()==1){
            result+=w+""}
         if(w.charAt(w.length()-1)=='e'&&w.charAt(w.length()-2)=='m'){
         result=+w='_';}
         else{
         result+=w;}
        }
        result+="";
        }
        return result;
        }
         */
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre a number among 1,2,3 : 1.programme gras();2.programme cesar();3.programme plateforme().");
        String choices = input.nextLine();
        switch (choices) {
            case "1":
                // recall the first method
                String str = gras("To make All the word Beginning with lowercase surrounded by *");
                System.out.println(str);
                break;
            case "2":
                //recall the second method
                System.out.println(cesar("Let me check if the letters in the phrase have been pushed backwards for every two positions or not."));
                break;
            case "3":
                //recall the third method
                System.out.println(plateforme("The plateforme which uses the method laplateforme should be printed for me correctly."));
                break;
            default:
                System.out.println("input invalid, re-entre 1 or 2 or 3.");
                choices = input.nextLine();
        }

    }
}



