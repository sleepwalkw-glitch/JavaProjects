package TableauxEtChainesEnJava;

public class Job06 {
    public static void main(String[] args) {
        String str="Les choses que l'on possède finissent par nous posséder.";
        char[] charArray=str.toCharArray();
        for(int i= charArray.length-1;i>=0;i--){
            System.out.print(charArray[i]);
        }

    }
}
