public class Methods {


    // static void change(int a){
    //     a = 98 ;
    // }
    // static void change2(int arr[]){
    //     arr[0] = 98 ;
    // }
    // static void tellJoke(){
    //     System.out.println("I invented a new word!\n" + "Plagiarism") ;
    // }
    //  static int logic(int x , int y){
    //     int z ;
    //         if(x>y){
    //         z = x + y ;
    //      }
    //      else{
    //         z = (x + y) * 5 ;
    //      }
    //      return z ;
    // }


    // METHOD OVERLOADING

    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " Bro!");
    }
    static void foo(int a , int b){
        System.out.println("Good Morning " + a + " Bro!");
        System.out.println("Good Morning " + b + " Bro!");
    }


    public static void main(String[] args) {


        // METHOD OVERLOADING IN JAVA
        foo();
        foo(300);
        foo(200 , 400);


        
        // tellJoke();
        // Case 1 :- Changing the integer.
        // int x = 45 ;
        // change(x) ;
        // System.out.println("The value of x after running change is : " + x);
        // Case 2 :- Changing the array.
        // int [] marks = {52 , 73 , 77 , 89 , 98 , 94} ;
        // change2(marks) ;
        // System.out.println("The value of x after running change is : " + marks[0]);
        //  int a = 5 ;
        //  int b = 7 ;
        //  int c ;
        //  // Method invocation using object creation
        //  //  Methods obj = new Methods();
        //  //  c = obj.logic(a , b) ;
        //  c = logic(a  , b) ;

        //  int a1 = 2 ;
        //  int b1 = 1 ;
        //  int c1 ;
        //  // c1 = obj.logic(a1, b1) ;
        //  c1 = logic(a1  , b1) ;
        //  System.out.println(c);
        //  System.out.println(c1);
    }
}
