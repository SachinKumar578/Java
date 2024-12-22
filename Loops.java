import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // WHILE LOOPS
        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);

        // System.out.println("Using Loops");
        // int i = 1 ;
        // while(i<=3){
        //     System.out.println(i);
        //     i++ ;
        // }
        // System.out.println("Finish running while Loop!");

        // Quick Quiz:- WAP to print natural numbers from 100 to 200.
        // int num = 100 ;
        // while(num<=200){
        //     System.out.println(num);
        //     num++ ;
        // }

        // DO WHILE LOOPS
        // int num = 100 ;
        // do{
        //    System.out.println(num);
        //    num++ ;
        // }
        // while(num<=200);

        // Quick Quiz:- WAP to print first n natural numbers using do while loop.
        // System.out.print("Enter a positive integer : ");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int i = 1 ;
        // System.out.println("Natural numbers from 1 to " + num);
        // do{
        //     System.out.println(i);
        //     i++ ;
        // }
        // while(i<=num);
        

        // FOR LOOPS
        // for(int i=1 ; i<=10 ; i++){
        //     System.out.println(i);
        // }

        // Quick Quiz:- WAP to print first n odd numbers using for loop.
        // System.out.print("Enter a positive integer : ");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println("Odd numbers from 1 to " + num);
        // for(int i=1 ; i<=num ; i=i+2){
        //     System.out.println(i);
        // }

        // Quick Quiz:- WAP to print first n natural numbers in reverse order.
        // System.out.print("Enter a positive integer : ");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println("Natural numbers from " + num + "to 1 :");
        // for(int i=num ; i>0 ; i-- ){
        //     System.out.println(i);
        // }

        // BREAK USING LOOPS.
        // Using For Loop
        // for(int i=0 ; i<5 ; i++){
        //     System.out.println(i);
        //     System.out.println("Java is great.");
        //     if(i==2){
                // System.out.println("Ending the Loop.");
                // break;
        //     }
        // }

        // Using While Loop.
        // int i = 0 ;
        // while(i<5){
        //     System.out.println(i);
        //     System.out.println("Java is great.");
        //     if(i==2){
        //     System.out.println("Ending the Loop.");
        //     break;
        //     }
        //     i++ ;
        // }

        // Using Do-While Loop.
        // int i = 0 ;
        // do{
        //     System.out.println(i);
        //     System.out.println("Java is great.");
        //     if(i==2){
        //     System.out.println("Ending the Loop.");
        //     break;
        //     }
        //     i++ ;
        // } while(i<5);
        //  System.out.println("Loop ends here.");



        // CONTINUE USING LOOPS.
        // Using For Loop
        // for(int i=0 ; i<5 ; i++){
        //     if(i==2){
        //         System.out.println("Ending the Loop.");
        //         continue;
        //     }
        //     System.out.println(i);
        //     System.out.println("Java is great.");
        // }

        // Using While Loop.
        // int i = 0 ;
        // while(i<5){
        //     if(i==2){ 
        //     System.out.println("Ending the Loop.");
        //     i++;
        //     continue;
        //     }
        //     System.out.println(i); 
        //     System.out.println("Java is great.");
        //     i++ ;
        // }

        // // Using Do-While Loop.
        int i = 0 ;
        do{
            if(i==2){
            System.out.println("Ending the Loop.");
            i++ ;
            continue;
            }
            System.out.println(i);
            System.out.println("Java is great.");
            i++;
        } 
        while(i<5);
         System.out.println("Loop ends here.");



    }
}
