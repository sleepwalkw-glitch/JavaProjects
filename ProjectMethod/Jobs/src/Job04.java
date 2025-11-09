public class Job04 {
    static double calcule(double a,String operation,double b){
        double result=0;
        switch (operation){
            case "+":
                result=a+b;
                System.out.println("the result is:"+result);
                break;
            case "-":
                result=a-b;
                System.out.println("the result is:"+result);
                break;
            case "*":
                result=a*b;
                System.out.println("the result is:"+result);
                break;
            case "/":
                if (b!=0){
                    result=a/b;
                    System.out.println("the result is:"+result);
                    break;}
                else {
                    System.out.println("the number divided can not be 0.");
                    break;
                }
            case "%":
                if(b!=0){
                    result=a%b;
                    System.out.println("the result is:"+result);
                    break;
                }
                else {
                    System.out.println("the number divided can not be 0.");
                    break;
                }
            default:
                System.out.println("Your calculation is not valid.");
        }
        return result;
    }

    // to use if else-if and else works as well

  public static void main(String[] args){
        calcule(3,"+",6);
        calcule(3,"-",9);
        calcule(3,"*",6);
        calcule(3,"/",6);
        calcule(3,"%",6);

     /* the second way of recalling the method defined above
      System.out.println(calcule(3,"+",6));
      System.out.println(calcule(3,"-",6));
      System.out.println(calcule(3,"*",6));
      System.out.println(calcule(3,"/",0));
      System.out.println(calcule(3,"%",6));*/

  }
}
