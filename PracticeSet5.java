import java.util.Scanner;

public class PracticeSet5 {
    public static void main(String[] args) {
        
    // Question 1:- WAP to print the following pattern.
    //                  * * * * * 
    //                  * * * * 
    //                  * * * 
    //                  * *
    //                  *
    //    Scanner sc = new Scanner(System.in);    
    //    System.out.print("Enter the number of rows : "); 
    //    int n = sc.nextInt();
    //    for(int row=0 ; row<n ; row++){
    //     for(int col=0 ; col<n-row ; col=col+1){
    //     System.out.print("* ");
    //    } 
    //    System.out.print("\n");  
    // }


    // Question 2:- WAP to sum first n even numbers using while loop.
    // Scanner sc = new Scanner(System.in);    
    // System.out.print("Enter the number to print sum of even numbers : "); 
    // int num = sc.nextInt(); 
    // int i = 0 ;
    // int sum = 0 ;
    // while(i<num){
    //     sum = sum + (2*i) ; 
    //     i++ ;  
    // }
    // System.out.print("Sum of first " + num + " even numbers : "+ sum);

    
    // Question 3:- WAP to print multiplication table of a given number n.
    // Scanner sc = new Scanner(System.in);    
    // System.out.print("Enter the number to print table : "); 
    // int num = sc.nextInt(); 
    // for(int i=1 ; i<11 ; i++){
    //      int table = num*i ;
    //      System.out.println(num + " X " + i + " = " + table);
    // }


    // Question 4:- WAP to print multiplication table of 10 in reverse order.
    // int num = 10 ;
    // System.out.println("Table of 10 in reverse order :");
    // for(int i=10 ; i>0 ; i--){
    //     int table = num*i ;
    //     System.out.println(num + " X " + i + " = " + table);
    // }


    // Question 5:- WAP to print factorial of a given number using for loop.
    // System.out.print("Enter the number to find factorial : ");
    // Scanner sc = new Scanner(System.in);    
    // int num = sc.nextInt(); 
    // int fact = 1 ;
    // for(int i=num ; i>0 ; i--){
    //     fact = fact*i ;
    //    }
    //    System.out.print("Factorial of " + num + " is : ");
    //    System.out.print(fact);


    // Question 6:- Repeat question 5 using while loop.
    // System.out.print("Enter the number to find factorial : ");
    // Scanner sc = new Scanner(System.in);    
    // int num = sc.nextInt(); 
    // int fact = 1 ;
    // int i = num ;
    // while(i>0){
    //     fact = fact*i ;
    //     i-- ;
    // }
    // System.out.print("Factorial of " + num + " is : ");
    //    System.out.print(fact);


    // Question 7:- Repeat question 1 using while loop.
    //    Scanner sc = new Scanner(System.in);    
    //    System.out.print("Enter the number of rows : "); 
    //    int n = sc.nextInt();
    //    int row = 0 ;
    //    while(row<n){
    //     int col = 0 ;
    //     while(col<n-row){
    //         System.out.print("* ");
    //         col++ ;
    //     }
    //     System.out.println();
    //     row++ ;
    //    }


    // Question 8:- Repeat question 2 using for loop.
    // Scanner sc = new Scanner(System.in);    
    // System.out.print("Enter the number to print sum of even numbers : "); 
    // int num = sc.nextInt(); 
    // int sum = 0 ;
    // for(int i=0 ; i<num ; i++){
    //     sum = sum + (2*i);
    // }
    // System.out.print("Sum of first " + num + " even numbers : "+ sum);


    // Question 9:- WAP to calculate the sum of the numbers occouring in 
    // the multiplication table of n.
    Scanner sc = new Scanner(System.in);    
    System.out.print("Enter the number : "); 
    int num = sc.nextInt();
    int sum = 0 ; 
    for(int i=1 ; i<11 ; i++){
         int table = num*i ;
         sum = sum + table ;
        }
        System.out.print("Sum of the numbers occouring in\nthe multiplication table of " + num + " is ");
        System.out.println(sum);
    }
}
