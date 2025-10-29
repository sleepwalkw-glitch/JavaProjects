package MiniProjetsJobsJava;

public class Job04 {
    public static void main(String[] args) {

        int a;
        for (a = 1; a <= 100; a++) {

            if (a % 3 == 0) {
                System.out.println("Fizz");
            }
            if (a % 5 == 0) {
                System.out.println("Buzz");
            }
            if (a % 3 == 0&&a % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else  {
                System.out.println(a);
            }



        }


    }
}

