package TableauxEtChainesEnJava;

public class JobBonus {
    public static void main(String[] args) {
    // first version with do while
        int[] arr = {84, 12, 1, 43, 5, 0};
        boolean is_done = false;
        int counter = 0;
        do {
            is_done = true;
            for(int i = 0; i < arr.length-1; i++)
            {
                if (arr[i] > arr[i+1])
                {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    is_done = false;
                }
            }
            counter++;//for understanding of the times of loops which have been executed.
            System.out.println(counter);
            for(int num : arr)
            {
                System.out.print(num);
                System.out.print(",");
            }
            System.out.println("end");//for marking the end
        }
        while(!is_done);
    }
}

/*
    version 2 : use nested for loop to replace the larger one with the one next to it and put the largest to the last index position
    int[] arr={84,12,1,43,5,0};
    for (int i=0;i<arr.length-1;i++){
        for( int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+i]=temp;
            }
        }
        for(int x:arr){
            System.out.print(x+"");
    }
        System.out.println();
}

*/

