public class VarArgs {
    // static int sum(int a , int b){
    //     return a+b ;
    // }
    // static int sum(int a , int b , int c){
    //     return a+b+c ;
    // }
    // static int sum(int a , int b , int c , int d){
    //     return a+b+c+d ;
    // }

    static int sum(int ...arr){
        // Available as int [] arr ;
        int result = 0 ;
        for(int a : arr){
            result += a ;
        }
        return result ;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs tutorial.");
        System.out.println("Sum of 4 and 5 is : " + sum(4 , 5));
        System.out.println("Sum of 4 , 3 and 5 is : " + sum(4, 3 , 5));
        System.out.println("Sum of 4 , 2 , 3 and 5 is : " + sum(4, 2 , 3 , 5));
    }
}
