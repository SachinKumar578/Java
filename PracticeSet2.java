import java.util.Scanner;

public class PracticeSet2 {
    public static void main(String[] args) {
     // Question1:- WAP to encrypt a grade by adding 8 to it and 
     // decrypt it to show the correct grade.

    //  char grade = 'B' ;
    //  grade = (char)(grade + 8) ;
    //  System.out.println(grade);

    //  // Decrypting the grade...
    //  grade = (char)(grade - 8) ;
    //  System.out.println(grade);


    // Question2:- Use comparison operators to find out whether a given number is greater 
    // than the user entered number or not.

    int num1 = 12 ;
    System.out.print("Enter the number to compare : ");
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.println(num1>num2);

        sc.close();

    }
}
