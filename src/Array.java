public class Array {
    public static void main(String[] args){
        String[] studentNames; //declare an array of integers
        studentNames = new String[]{"John","David","Henry","Bob","Victor"}; //array of names
        int[] studentAge = new int[]{25,32,29,39,40}; //Array of ages
//        int[] studentGrade = new String[]{"4.0","3.23"}; <= this is not compatible, have to yse the data type when declaring array
        double[] studentGrade = new double[]{4.0,3.25,3.0,2.9,3.5};
        String[] studentSubject = new String[6]; //if you make more outside  the length it will give error
        studentSubject[0] = "Computer Science";
        studentSubject[1] = "Psychology";
        studentSubject[2] = "History";
        studentSubject[3] = "Biology";
        studentSubject[4] = "English";
        studentSubject[5] = "Astronomy";

        System.out.println( studentNames[0]);
        System.out.println( studentNames[2]);
        System.out.println( studentNames[4]);
        System.out.println( studentAge[0]);
        System.out.println( studentAge[4]);
        System.out.println(studentGrade[3]);
        System.out.println(studentSubject[5]);

    }
}
