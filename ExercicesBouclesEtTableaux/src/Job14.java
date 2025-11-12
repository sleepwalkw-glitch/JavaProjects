public class Job14 {

    static void multiplication()
    {   int[] tab ={2, 3, 4,1,5};
        int produit=1;
        // way 1
        for (int i= 0;i< tab.length;i++) {
            produit = tab[i] * produit;
            System.out.println(produit);
        }
            System.out.println();
/* second way ; for each*/
            int produit1=1;
            for(int c: tab){
                produit1=c*produit1;
                System.out.println("The result of multiplication of the elements in this array is :"+produit1);
            }
            System.out.println();
    }

    static void main(String[] args) {

        multiplication();

    }
}
