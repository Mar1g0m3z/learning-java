//PRIMITIVE DATA TYPES
// Byte: 8-bit signed two complement integer. min -128 and max of 127. Good for saving memory in large arrays.
// Short:  16-bit signed two complement integer. it has a min of -32,768 and max of 32,767. use to save memory in large array, in situation where memory savings actually matter
// Int:  most common- 2-bit signed two's complement integer, which has min value of -2^31 and max of 2^31-1. Int is normally used in Java to support arithmetic operation for integers.
// Long: is 64 bit two-s complement integer. min -2^63 and max 2^63 -1. Use when you need a range of value wider than those in int
// Float: data type is single-precision 32-bit floating integers. Use float if you need to save memory in large arrays of floating point numbers.
// Double: double-precision 64-bit floating point. For decimal values, generally default choice
// Boolean: has two possible values: true and false. Use for simple flags that track true or false conditions
// Char: single 16-bit Unicode character. min value of '\u0000' (or 0) and max value of 'u\ffff' Should always be in single quotes

public class DataTypes {
    public static void main (String[] args){
        byte b1 = 21; // byte after 2 integers error
        short shortNumber = 24; //short after 6 digits it errors
        int i1 = 2500; // int can hold 9 digits
        long longNumber = 1313000000; //long can hold 10 digits
        double balance = 123; //double even if you don't put digits computer will auto .00
        float floatingNumber = 241.3f; // floating/float - every float needs f at the end
        boolean bool1 = true; //boolean
        char char1 = 'A'; //char can only hold 1 character and don't double quote
        System.out.println(b1);
        System.out.println(balance);
    }
}

