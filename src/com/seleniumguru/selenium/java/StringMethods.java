package com.seleniumguru.selenium.java;

import java.util.Arrays;

//when you create a string you reuse the string class
//length() - returns the length of string
//format((=String s) - returns formatted string
//substring(inst index) - return substring for given index
//you can also have int beginIndex, int endIndex -returns the substring starting from the beginning index and end index
//contains(Char c) - returns true or false after matching the sequence of char value.
//equals(String) - check the equality of string with object
//equalIgnoreCase(String) - compares another string ignoring case sensitivity
//isEmpty() - check if string is empty.
public class StringMethods {
    public static void main(String[] args){
        String str1 = "Hello Students";
        String str2 = "Welcome";
        String str3 = "TEST";
        String str4 = "java";
        String str5 = "            string           ";
        int totalStudents = 50;
        String str6 = "abc def ghi";
        String[] strCount = str6.split("\\s+"); //split string with regex expression <- becomes an array as well
        System.out.println(Arrays.toString(strCount));
        System.out.println(str1.concat(str2)); //append string2 to string1
        System.out.println(str1.replace("e","a")); //replaces e with a
        System.out.println(str3.toLowerCase()); //converts to lowercase
        System.out.println(str4.toUpperCase()); //converts to UPPERCASE
        System.out.println(str5.trim()); // trims white spaces to string
        System.out.println(String.valueOf(totalStudents)); //parse in to string (makes number string type?)
        System.out.println(str1.length()); //find length of string
        System.out.println(str1.substring(1));; //return string after 1 index
//        System.out.println(str1.substring(6,13));
        System.out.println(str1.contains("Hello")); //returns true if str1 contains the string hello
        System.out.println(str2.equals("welcome")); //returns true or false if str2 equals  exactly welcome
        System.out.println(str2.equalsIgnoreCase("welcome"));
        //returns true or false if str2 equals welcome ignores case sensitivity.
        System.out.println(str3.isEmpty()); //returns true if str3 is empty
//        System.out.println(strCount);
//        for each loop to print out each word
        for (String s: strCount){
          System.out.println("Word: " + s);
        }

    }
}
//concat(String s) - concatenates(joins) specified string
//replace(Char a, Char b) - replaces all occurrences of that specified char value
//split(String regEx) - returns split string matching regex
//toLowerCase()- returns string in lowercase
//toUpperCase()- returns string in uppercase