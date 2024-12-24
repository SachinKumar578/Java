import java.util.Scanner;

public class PracticeSet6 {
    public static void main(String[] args) {
        
        // Question 1 :- Create an array of five floats and calculate their sum.

        // float [] num = {4.5f , 8.5f , 6.5f , 9.5f , 3.5f } ;
        // float sum = 0 ;
        // for(int i=0 ; i<num.length ; i++){
        //     sum = sum + num[i] ;
        // }
        // System.out.println("Sum of the floats : " + sum);


        // Calculating sum , from taking user input.

        // Scanner sc = new Scanner(System.in);
        // // Step 1 :- Asking for the size of Array.
        // System.out.print("Enter the size of Array : ");
        // int size = sc.nextInt();
        // // Step 2 :- Creating an array of the given size.
        // float [] num = new float[size];
        // // Step 3 : - Taking input for each element.
        // System.out.print("Enter " + size + " float numbers : ");
        // for(int i=0 ; i<size ; i++){
        //     num[i] = sc.nextFloat();
        // }
        // // Step 4 :- Calculating and printing the sum.
        // float sum = 0 ;
        // for(int i=0 ; i<size ; i++){
        //     sum = sum + num[i] ;
        // }
        // System.out.println("Sum of the floats : " + sum);



        // Question 2 :- WAP to find out whether a given integer is 
        //               present in an array or not.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of the array : ");
        // int size = sc.nextInt();
        // int [] integer = new int[size];
        // System.out.print("Enter " + size + " integers : ");
        // for(int i=0 ; i<size ; i++){
        //     integer[i] = sc.nextInt();
        // }
        // System.out.print("Enter the integer to find out : ");
        // int find = sc.nextInt();
        // boolean isInArray = false ;
        // for(int i=0 ; i<size ; i++){
        //     if(integer[i]==find){
        //         isInArray = true ;
        //         break ; 
        //     }
        // }
        // if(isInArray){
        //     System.out.println(find + " is present in the array.");  
        // }
        // else{
        //     System.out.println(find + " is not present in the array."); 
        // }



        // Question 3 :- Calculate the average marks from an array containing marks of 
        //               all students in physics using for each loop.
       
       /*  Scanner sc = new Scanner(System.in);
        // Step 1 :- Asking for the size of Array.
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        // Step 2 :- Creating an array of the given size.
        float [] marks = new float[size];
        // Step 3 : - Taking input for each element.
        System.out.print("Enter " + size + " marks in Physics : ");
        for(int i=0 ; i<size ; i++){
            marks[i] = sc.nextFloat();
        }
        // Step 4 :- Calculating and printing the sum.
        float sum = 0 ;
        for(float element : marks){
            sum = sum + element ;
        }
        System.out.println("The value of average marks is : " + sum/marks.length);
     */



     // Question 4 :- WAP to add two matrices of size 2 X 3.

     //  int [][] mat1 = { {1 , 2 , 3} , {4 , 5 , 6} } ;
     //  int [][] mat2 = { {2 , 6 , 13} , {3 , 7 , 1} } ;
     //  int [][] result = { {0 , 0 , 0} , {0 , 0 , 0} } ;

     //  for(int i=0 ; i<mat1.length ; i++){  // row number of times
     //     for(int j=0 ; j<mat1[i].length ; j++){ // column number of times
     //           result[i][j] = mat1[i][j] + mat2[i][j] ;
     //           System.out.print(result[i][j] + " ") ;
     //     }
     //     System.out.println("");
     //  } 




     // Question 5 :- WAP to reverse an array.
     // 1st method :

     // int[] arr = {1, 2, 3, 4, 5};
     //     System.out.print("Original array: ");
     //     for (int num : arr) {
     //         System.out.print(num + " ");
     //     }

     //     // Reversing the array in place
     //     for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
     //         int temp = arr[i];
     //         arr[i] = arr[j];
     //         arr[j] = temp;
     //     }

     //     System.out.print("\nReversed array: ");
     //     for (int num : arr) {
     //         System.out.print(num + " ");
     //     }


     // 2nd method :
     // int [] arr = {1 , 2 , 3 , 4 , 5 , 6} ;
     // int l = arr.length ;
     // int n = Math.floorDiv(l , 2) ;
     // int temp ;
     // for(int i=0 ; i<n ; i++){
     //    // swap a[i] and a[l-1-i]
     //    temp = arr[i] ;
     //    arr[i] = arr[l-1-i] ;
     //    arr[l-1-i] = temp ;
     // }
     // for(int element : arr){
     //     System.out.print(element + "    ");
     // }



     // Question 6 :- WAP to find the maximum element in an array.

     // int [] arr = {111 , 82 , 322 , 241 , 55 , 666} ;
     // int max = 0 ;
     // for(int e :arr){
     //     if(e>max){
     //         max = e ;
     //     }
     // }
     //     System.out.println("The value of the maximum element in this array is : " + max);


    
     // Question 6 :- WAP to find the minimum element in an array. 
     //  int [] arr = {111 , 82 , 322 , 241 , 55 , 666} ;
     //  int min = arr[0] ;
     //  for(int e :arr){
     //     if(arr[0] > e){
     //         min = e ;
     //     }
     // }
     //  System.out.println("The value of the minimum element in this array is : " + min);


     // Question 8 : - WAP to find whether an array is sorted or not.
      
     boolean isSorted = true ;
     int [] arr = {11 , 82 , 322 , 3241 , 5555 , 6666} ; 
     for(int i=0 ; i<arr.length-1 ; i++){
        if(arr[i] > arr[i+1]){
            isSorted = false ;
            break ;
        }
     }
     if(isSorted){
        System.out.println("The array is sorted.");
     }
     else{
        System.out.println("The array is not sorted.");
     }

    }
}
