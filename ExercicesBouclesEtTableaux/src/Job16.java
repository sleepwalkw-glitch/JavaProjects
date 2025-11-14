import org.w3c.dom.ls.LSOutput;

public class Job16 {
    public static void difference(){
        int[] notes = {12,15,10,18,15};
        int moy ;
        int sum=0;
        int difference;
        for (int i=0;i<notes.length;i++){
            sum=sum+notes[i];
        }

        moy=sum/notes.length;
        System.out.println("the average score is : "+moy);

        for(int i=0;i<notes.length;i++){
            difference=notes[i]-moy;
            System.out.println("the score of the "+(i+1)+" is "+notes[i]+". the difference is "+difference);
        }
    }

    static void main(String[] args) {
        difference();

    }


}
