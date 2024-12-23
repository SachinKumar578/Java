public class Arrays {
    public static void main(String[] args) {
        /* classroom of 500 students , you have to store the marks of 500 students.
         1. Create 500 variables.   -> Bad practice 
         2. Use Arrays.   -> Good practice 
        */
        
        // There are three main ways to createan array in java.

        // 1. Declaration and memory allocation.

        // int [] marks = new int[5]; // declaration and memory allocation.

        //  initialization.
        // marks[0] = 85 ;
        // marks[1] = 60 ;
        // marks[2] = 70 ;
        // marks[3] = 90 ;
        // marks[4] = 86 ;

        //  accessing the array.
        //     int n = 5 ;
        //     for(int i=0 ; i<n ; i++){
        //     System.out.println(marks[i]);
        //  }


        // 2. Declaration and then memory allocation.

        // int [] marks ; // declaration.
        // marks = new int[5] ; // memory allocation.

        // initialization.
        // marks[0] = 85 ;
        // marks[1] = 60 ;
        // marks[2] = 70 ;
        // marks[3] = 90 ;
        // marks[4] = 86 ;

        // accessing the array.
        //     int n = 5 ;
        //     for(int i=0 ; i<n ; i++){
        //     System.out.println(marks[i]);
        //  }


        // 3. Declaration , Memory allocation and Initialization together.

        // int [] marks = {65 , 74 , 88 , 84 , 90} ;

        // //    accessing the array.
        //     int n = 5 ;
        //     for(int i=0 ; i<n ; i++){
        //     System.out.println(marks[i]);
        // }


        // Array length
        // int [] marks = {65 , 74 , 88 , 84 , 90} ;
        // float [] marks = {65.5f , 74.5f , 88.5f , 84.5f , 90.5f} ;
        // System.out.println(marks.length);
        // System.out.println(marks[2]);

        // String [] students = {"Harray" , "Sachin" , "Ashish" , "Abhishek" , "Ravi"} ;
        // System.out.println(students.length);
        // System.out.println(students[3]);


        // int [] marks = {65 , 74 , 88 , 84 , 90} ;
        //System.out.println(marks.length);

        // Displaying the array (Naive way)
        // System.out.println("Printing using naive method");
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);
        
        // Displaying the array using for loop.
        // System.out.println("Printing using for loop");
        // for(int i=0 ; i<marks.length ; i++){
        // System.out.println(marks[i]);
        // }


       // Quick Quiz :- WAP to print the elements of an array in reverse order.

    //    System.out.println("Printing in reverse order");
    //     for(int i=marks.length-1 ; i>=0 ; i--){
    //     System.out.println(marks[i]);
    //     }

    // printing using for-each loop
        // for(int element: marks){
        //     System.out.println(element);
        // }



        // MULTIDIMENSIONAL ARRAY.

       // int [] marks ; // 1-D Array.
        int [][] flats ; // 2-D Array.
        flats = new int[2][3] ;
        flats[0][0] = 101 ;
        flats[0][1] = 102 ;
        flats[0][2] = 103 ;
        flats[1][0] = 201 ;
        flats[1][1] = 202 ;
        flats[1][2] = 203 ;

        // Displaying the 2-D array using for loop.
        System.out.println("Printing the 2-D array using for loop.");
        for(int i=0 ; i<flats.length ; i++){
            for(int j=0 ; j<flats[i].length ; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }   
            System.out.println();
        }
    }
}
