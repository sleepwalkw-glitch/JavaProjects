package TableauxEtChainesEnJava;

public class Job03 {
    public static void main(String[] args) {

        String str=" I'm sorry Dave I'm afraid I can't do that ";

// first version : with for and if
        for(int i=0;i<str.length();i++)

        {
            if (str.charAt(i)=='a' ||  str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'|| str.charAt(i)=='y'|| str.charAt(i)=='A'|| str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U' ||str.charAt(i)=='Y')
            {System.out.print(str.charAt(i));
            break;}
        }


//second version : for regular and with the index of the string to compare every character

       char [] char_voyelles = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
        for(int i=0;i<str.length();i++)
        {
            for (char charVoyelle : char_voyelles) {
                if (str.charAt(i) == charVoyelle) {
                    System.out.print(str.charAt(i));
                    break;
                }
            }

/* third way : with for each
    String str=" I'm sorry Dave I'm afraid I can't do that ";
    char[] array1= str.toCharArray();
    char[] v={'a', "e", "i", "y","o", "u","A","E","I","O","U","Y"};
    for(char a:array1){
    for(char c:v){
     if (c==v)}
    }
  */

    }   }
}
