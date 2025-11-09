public class Job06 {
    static String leetSpeak(String str) {
        // change the String to char and use for and if-else to make all the letters to be replaced by the numbers,but for print, is should be changed again to the type String
// first version : for each with if and else if
        char[] tochar = str.toCharArray();
        String result = "";// to initiate the value for the argument in the method with parameter

        for (char trans : tochar) {
            if (trans == 'A'||trans == 'a') {
                trans = '4';
            } else if (trans == 'B'||trans == 'b') {
                trans ='8';
            } else if (trans == 'E'||trans == 'e') {
                trans ='3';
            } else if (trans == 'G'||trans == 'g') {
                trans ='6';
            } else if (trans == 'L'||trans == 'l') {
                trans ='1';
            } else if (trans == 'S'||trans == 's') {
                trans ='5';
            } else if (trans == 'T'||trans == 't') {
                trans ='7';
            }

            result += trans;// the type char can be given to String directly, like cast data type widening.
        }
        return result;

    /*   second version : switch with or without String method toUpperCase
    switch01 : use toLowercase to simplify the switch

        String result="";
        for (int i=0;i<str.length()-1;i++) {
        //char c=Character.toUpperCase(str); switch(c) or using the method toUpperCase within
        switch(Character.toUpperCase(str.charAt(i))) {
                case 'A':
                    result += "4";
                    break;
                case 'B':
                    result += "8";
                    break;
                case 'E':
                    result += "3";
                    break;
                case 'G':
                    result += "6";
                    break;
                case 'L':
                    result += "1";
                    break;
                case 'S':
                    result += "5";
                    break;
                case 'T':
                    result += "7";
                    break;
                default:
                    result += str.charAt(i);
            }
        }
        return result;
     */

    /* switch02 : use switch to repeat all the letters need to be replaced without toLowercase.
           String result = "";// to initiate the value for the argument in the method with parameter
           for (int i=0;i<=str.length()-1;i++){
             switch (str.charAt(i)) {
                    case 'A':
                        result += "4";
                        break;
                    case 'a':
                        result += "4";
                        break;
                    case 'B':
                        result += "8";
                        break;
                    case 'b':
                        result += "8";
                        break;
                    case 'E':
                        result += "3";
                        break;
                    case 'e':
                        result += "3";
                        break;
                    case 'G':
                        result += "6";
                        break;
                    case 'g':
                        result += "6";
                        break;
                    case 'L':
                        result += "1";
                        break;
                    case 'l':
                        result += "1";
                        break;
                    case 'S':
                        result += "5";
                        break;
                    case 's':
                        result += "5";
                        break;
                    case 'T':
                        result += "7";
                        break;
                    case 't':
                        result += "7";
                        break;
                    default:
                        result += str.charAt(i);
                }

            }
            return result;
    */
    }




    static void main(String[] args) {
       // for if else version
       String str="Try if this programme runs well.";
        System.out.println(leetSpeak(str));

        /* Choice 1 for print the result
        String str = leetSpeak("Try if this programme runs well.");
        System.out.println(str);
         */

        /* Choice 2
        System.out.println(leetSpeak("Try if this programme runs well."));*/

    }

}