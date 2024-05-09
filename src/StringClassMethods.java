//when you create a string you reuse the string class
//length() - returns the length of string
//format((=String s) - returns formatted string
//substring(inst index) - return substring for given index
//you can also have int beginIndex, int endIndex -returns the substring starting from the beginning index and end index
//contains(Char c) - returns true or false after matching the sequence of char value.
//equals(String) - check the equality of string with object
//equalIgnoreCase(String) - compares another string ignoring case sensitivity
//isEmpty() - check if string is empty.

public class StringClassMethods {
    public static void main(String[] args){
        String str1 = "Hello Students" + "Welcome to Java World";
        String str2 = "Welcome";
        String str3 = "";
        System.out.println(str1.length()); //find length of string
        System.out.println(str1.substring(1));; //return string after 1 index
        System.out.println(str1.substring(6,13));
        System.out.println(str1.contains("Hello")); //returns true if str1 contains the string hello
        System.out.println(str2.equals("welcome")); //returns true or false if str2 equals  exactly welcome
        System.out.println(str2.equalsIgnoreCase("welcome"));
        //returns true or false if str2 equals welcome ignores case sensitivity.
        System.out.println(str3.isEmpty()); //returns true if str3 is empty

    }
}
