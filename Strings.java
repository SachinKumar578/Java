public class Strings {
    public static void main(String[] args) {
       // String name = new String("Sachin");
       String name = "Sachin" ;
        System.out.println(name);

        // .length() method
        // int value = name.length();
        // System.out.println(value);

        // // .toLowerCase() method
        // String lString = name.toLowerCase();
        // System.out.println(lString);

        // // .toUpperCase() method
        // String uString = name.toUpperCase();
        // System.out.println(uString);
        

        // // .trim() method
        // String nonTrimmedString = "      Ashish     " ;
        // System.out.println(nonTrimmedString);
        // String trimmedString = nonTrimmedString.trim();
        // System.out.println(trimmedString);


        // .substring(int startIndex) method
        // String st = name.substring(2);
        // System.out.println(st);


        // .substring(int start , int end) method
        // String st = name.substring(1, 4) ;
        // System.out.println(st);


        // .replace('n' , 't') method
        // String rep = name.replace('n','t');
        // System.out.println(rep);
        // String rep1 = name.replace("hin","klm");
        // System.out.println(rep1);


        // .startswith("Sa") method
        // System.out.println(name.startsWith("kc"));
        // System.out.println(name.startsWith("Sa"));
        
        
        // .endswith("in") method
        //System.out.println(name.endsWith("ik"));
        //System.out.println(name.endsWith("in"));


        // .charAt(2) method
       // System.out.println(name.charAt(3));


       // .indexOf(i) method
       //    String modifiedName = "Sachinhin" ;
        //    // System.out.println(modifiedName.indexOf("hin"));
       //    // System.out.println(modifiedName.indexOf("hin",5));
       //    System.out.println(modifiedName.lastIndexOf("hin"));
       //    System.out.println(modifiedName.lastIndexOf("hin",5));


       // .equals("Sachin") method
       System.out.println(name.equals("Sachin"));
       System.out.println(name.equalsIgnoreCase("sAchin"));




    }
}
