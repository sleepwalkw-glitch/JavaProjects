package TableauxEtChainesEnJava;

public class Job07 {
    public static void main(String[] args) {
        String str="Certaines choses changent, et d'autres ne changeront jamais.";
        char[] charArray=str.toCharArray();
         System.out.print(Character.toUpperCase(charArray[1]));
        for(int i=2;i<charArray.length;i++){
            System.out.print(charArray[i]);
        }
        System.out.print(Character.toLowerCase(charArray[0]));
        System.out.println(" ");

// the way of replace all the letter to the next and redefine the first word and the last word in the sentence
     String str1="Certaines choses changent, et d'autres ne changeront jamais.";
     char[] letters1=str1.toCharArray();
     char first_char=letters1[0];
        for(int j=0;j<letters1.length;j++){
            if(j==0){
                letters1[j]=Character.toUpperCase(letters1[j+1]);
                continue;}
            if(j==letters1.length-1){
                letters1[j]=Character.toLowerCase(first_char);
                continue;}
            letters1[j]=letters1[j+1];}
     System.out.print(letters1);
     System.out.println(" ");

//version 03
    String str2="Certaines choses changent, et d'autres ne changeront jamais.";
    char[] letters2=str2.toCharArray();
    for (int k=1;k<letters2.length;k++){
        if(k==1){
            System.out.print(Character.toUpperCase(letters2[k]));
            continue;}
        System.out.print(letters2[k]);}
    System.out.print(Character.toLowerCase(letters2[0]));



    }
}
