import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the marks of subject 1 : ");
        float sub1 = sc.nextFloat();
        System.out.print("Enetr the marks of subject 2 : ");
        float sub2 = sc.nextFloat();
        System.out.print("Enetr the marks of subject 3 : ");
        float sub3 = sc.nextFloat();
        System.out.print("Enetr the marks of subject 4 : ");
        float sub4 = sc.nextFloat();
        System.out.print("Enetr the marks of subject 5 : ");
        float sub5 = sc.nextFloat();
        float totalMarks = sub1 + sub2 + sub3 + sub4 + sub5 ;
        System.out.print("Total marks is : ");
        System.out.println(totalMarks);
        float percentage = ((totalMarks/500)*100);
        System.out.print("Total percentage is : ");
        System.out.println(percentage);
    }
}
