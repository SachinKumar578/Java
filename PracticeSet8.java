// // Problem 1 :
// class Employee {

// int salary ;
// String name ;

// public int getSalary(){
//     return salary ;
// }

// public String getName() {
//     return name ;
// }

// public void setName(String n) {
//     name  = n ; 
// }
// }

// public class PracticeSet8 {
//     public static void main(String[] args) {
//         Employee sachin = new Employee();

//         sachin.setName("Sachin Kumar");
//         sachin.salary = 22000;
//         System.out.println(sachin.getSalary());
//         System.out.println(sachin.getName());

//     }
// }




// Problem 2 
// class CellPhone {
//     public void ring() {
//         System.out.println("Ringing...");
//     }
//     public void vibrate() {
//         System.out.println("vibrating...");
//     }
//     public void callFriend() {
//         System.out.println("Calling Ashish...");
//     }
// }

// public class PracticeSet8 {
//     public static void main(String[] args) {
//         CellPhone realme = new CellPhone();
//         realme.callFriend();  
//         realme.vibrate();  
//         realme.ring();
//     }
// }



//  Problem 3 
// class Square{
//     int side ;
//     public int area() {
//         return side*side ;
//     }
//     public int perimeter() {
//         return 4*side ;
//     }
// }
// public class PracticeSet8 {
//     public static void main(String[] args) {
//         Square sq = new Square() ;
//         sq.side = 5 ;
//        System.out.println("The area of the square is : " + sq.area()); 
//         System.out.println("The perimeter of the square is : " + sq.perimeter());
//     }
// }


// Problem 4
// class Rectangle{
//     int length ;
//     int breadth ;
//     public int area() {
//         return length*breadth ;
//     }
//     public int perimeter() {
//         return 2*(length+breadth) ;
//     }
// }
// public class PracticeSet8 {
//     public static void main(String[] args) {
//         Rectangle rec = new Rectangle() ;
//         rec.length = 10 ;
//         rec.breadth = 5 ;
//         System.out.println("The area of the rectangle is : " + rec.area());
//         System.out.println("The perimeter of the rectangle is : " + rec.perimeter());
//     }
// }



// Problem 5
// class Tommy{
//     public void hit(){
//         System.out.println("Hitting the enemy.");
//     }
//     public void run(){
//         System.out.println("Running from the enemy.");
//     }
//     public void fire (){
//         System.out.println("Firing on the enemy.");
//     }
// }
// public class PracticeSet8 {
//     public static void main(String[] args) {
//         Tommy player1 = new Tommy() ;
//         player1.hit();
//         player1.run();
//         player1.fire();
//     }
// }



// Problem 6 

class Circle {
    int radius ;
    public float area(){
        return 3.14f*radius*radius ;
    }
    public float perimeter() {
        return 2*3.14f*radius ;
    }
}
public class PracticeSet8 {
    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.radius = 5 ;
        System.out.println("The area of the circle is : " + cr.area());
        System.out.println("The perimeter of the circle is : " + cr.perimeter());
    }
}