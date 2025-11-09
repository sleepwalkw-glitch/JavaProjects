public class Job05 {
    static int occurrences(String str, char character) {
       /* for regular
        int counter = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            if (str.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }*/
// for each
    int counter=0;
    char[] letters= str.toCharArray();
    for(char c: letters){
        if (c == character) {
            counter++;
        }
    }
    return counter;
    }

    static void main(String[] args){
        //the first way of print
        String str="How do you feel today, are you happy?";
        char c='o';
        int resul=occurrences(str,c);
        System.out.println("character "+"'"+c+"'"+" has appeared "+resul+" times in the phrase: "+str);

        //the second way of print
        System.out.println(occurrences("How do you feel today, are you happy?",'o'));
    }

}
