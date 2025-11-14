public class Job19 {
    static void lenvers(){
        int[] num={2,4,5,8,9,10,34};
       // first way
        for(int i= num.length-1;i>=0;i--){
            System.out.println(num[i]);}
    }
/*  second way
        for(int i=0;i<num.length;i++){
            System.out.println(num[num.length-1-i]);}
    }*/

/* the third way, by for each with index;
        int index=0;
       for(int n: num){
       index++;
       System.out.println(num[num.length-1-index])}

       //or print from the last to the first ;
       index=num.length-1;
       for(int n:num){
       index--;
       System.out.println(num[index])}
     */
    static void main(String[] args) {
            lenvers();
    }
}

