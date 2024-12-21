public class PracticeSet3 {
    public static void main(String[] args) {
        
        // Question1:- WAP to convert a string to lowercase.
        // String str = "SACHIN" ;
        // String str1 = str.toLowerCase();
        // System.out.println(str1);


        // Question2:- WAPto replace spaces with underscores.
        // String str = "    SACHIN    " ;
        // System.out.println(str);
        // String str1 = str.replace("    ","____");
        // System.out.println(str1);


        // Question3:- WAP to fill in a letter template which looks like below:
        //             letter = "Dear <|name|> , thanks a lot."

        // String letter = "Dear <|name|> , thanks a lot!";
        // letter = letter.replace("<|name|>", "Sachin");
        // System.out.println(letter);


        // Question4:- WAP to detect double and tripple spaces.

        // String str = "This string contains double  and   tripple spaces." ;
        // System.out.println(str.indexOf("  "));
        // System.out.println(str.indexOf("   "));


        // Question5:- WAP to format the following letter using escape sequence characters.
        //       Letter = "Dear Harry, This java course is nice. Thanks!"

        String myLetter = "Dear Harry,\n\tThis java course is nice.\n\tThanks!";
        System.out.println(myLetter);

    }
}
