public class PracticeSet7 {

    // Question1:- Write a java method to print multiplication table of a number n.
    
    // static void multiplication(int n){
    //     for(int i=0 ; i<=10 ; i++){
    //         System.out.format("%d X %d = %d ",n , i , n*i );
    //         System.out.println();
    //     }
    // }

    // Question 2 :- WAP using functions to print the following pattern.
    //                  *
    //                  * *
    //                  * * *
    // 

    // static void pattern1(int n){
    //     for(int i=0  ; i<n ; i++){
    //         for(int j=0 ; j<i+1 ; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // Question 3 :- Write a recursive function to calculate sum of first n natural numbers.

    // static int sumRec(int n){
    //     // Base condition.
    //   if(n==1){
    //     return 1 ;
    //   } 
    //   return n + sumRec(n-1);
    // }

    // Question 4 :- Write a function to print the following pattern.
    //                  * * * * *
    //                  * * * * 
    //                  * * * 
    //                  * * 
    //                  *

    // static void pattern2(int n){
    //     for(int i=0  ; i<n ; i++){
    //         for(int j=0 ; j<n-i ; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }


    // Question 5 :- Write a function to print nth term of fibonacci series using recursion.
        
    // static int fib(int n){
        // if(n==1){
        //     return 0 ;
        // }
        // else if(n==2){
        //     return 1 ;
        // }
    //     if(n==1 || n==2){
    //         return n-1 ;
    //     }
    //     else {
    //         return fib(n-1) + fib(n-2) ;
    //     }
    // }

    // Question 6 :- Write a function to find average of a set of numbers passed as arguments.

    // static int average(int a , int b , int c , int d){
    //      return ((a+b+c+d)/4) ;
    // }


    // Question 7 :- Repeat question number 2 using recursion.
    // static void pattern1_rec(int n){
    //      if(n>0){
    //          pattern1_rec(n-1);
    //         for(int i=0 ; i<n ; i++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // Question 8 :- Repeat question number 4 using recursion.
    static void pattern2_rec(int n) { 
        if(n<=0){
            return ;
        }
           for(int i=0 ; i<n ; i++){
               System.out.print("* ");
              
           }
           
           System.out.println();
            pattern2_rec(n-1);
       }
   



    public static void main(String[] args) {
    
    // Question1:- Write a java method to print multiplication table of a number n.
            // multiplication(7);


    // Question 2 :- WAP using functions to print the following pattern.
    //                  *
    //                  * *
    //                  * * *
    //                  * * * *

    // pattern1(5);


    // Question 3 :- Write a recursive function to calculate sum of first n natural numbers.
    
    // int c = sumRec(5);
    // System.out.println(c);


    // Question 4 :- Write a function to print the following pattern.
    //                  * * * * *
    //                  * * * * 
    //                  * * * 
    //                  * * 
    //                  *

    // pattern2(5);


    // Question 5 :- Write a function to print nth term of fibonacci series using recursion.
        // int result = fib(7) ;
        // System.out.println(result);

    // Question 6 :- Write a function to find average of a set of numbers passed as arguments.
    //System.out.println("Average of these numbers is : " + average(4, 3 , 5 , 8));


    // Question 7 :- Repeat question number 2 using recursion.
    // pattern1_rec(5) ;

    // Question 8 :- Repeat question number 4 using recursion.
    pattern2_rec(5) ;



    

    }
}
