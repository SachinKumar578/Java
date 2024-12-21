import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args) {

        // Question1:
        // int a = 10 ;
        // if(a==11){
        //     System.out.println("I am 11");
        // }
        // else{
        //     System.out.println("I am not 11");
        // }

        // Question2:
        // byte m1 , m2 , m3;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your marks in Physics : ");
        // m1 = sc.nextByte();

        // System.out.print("Enter your marks in Chemistry : ");
        // m2 = sc.nextByte();

        // System.out.print("Enter your marks in Maths : ");
        // m3 = sc.nextByte();

        // float avg = ((m1+m2+m3)/3.0f);
        // System.out.println("Your overall percentage is : " + avg);
        
        // if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
        //     System.out.println("Congratulations, you have been promoted.");
        // }
        // else{
        //     System.out.println("Sorry, you have not been promoted!\nPlease try again.");
        // }
        // sc.close();

        
        // Question3:
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your income in lakhs per annum : ");
        // float tax = 0;
        // float income = sc.nextFloat();
        // if(income<=2.5){
        //     tax = tax + 0;
        // }
        // else if(income>=2.5f && income<=5f){
        //     tax = tax + 0.05f * (income - 2.5f);
        // }
        // else if(income>=5f && income<=10.0f){
        //     tax = tax + 0.05f * (5.0f - 2.5f);
        //     tax = tax + 0.2f * (income - 5.0f);
        // }
        // else if(income>=10.0f){
        //     tax = tax + 0.05f * (5.0f - 2.5f);
        //     tax = tax + 0.2f * (10.0f - 5.0f);
        //     tax = tax + 0.3f * (income - 10.0f);
        // }
        // System.out.print("The total tax paid by the employee is : " + tax + " lakhs");
        // sc.close();


        // Question4:
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number between 1 to 7 : ");
        // byte day = sc.nextByte();

        // switch (day){
        //     case 1 -> System.out.println("Sunday");
        //     case 2 -> System.out.println("Monday");
        //     case 3 -> System.out.println("Tuesday");
        //     case 4 -> System.out.println("Wednesday");
        //     case 5 -> System.out.println("Thursday");
        //     case 6 -> System.out.println("Friday");
        //     case 7 -> System.out.println("Saturday");
        // }
        //     sc.close();


        // Question5:
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter year : ");
        // int year = sc.nextInt();

        // if((year%4==0 && year%100!=0) || (year%400==0)){
        //     System.out.println(year + " is a leap year.");
        // }
        // else{
        //     System.out.println(year + " is not a leap year.");
        // }
        // sc.close();


        //Question6:
        System.out.println("Enter website :");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an Organizational website.");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial website.");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website.");
        }

    }
}
