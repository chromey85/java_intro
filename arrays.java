import javax.print.DocFlavor.STRING;

class Student {
    int rollnum;
    String name;
    int marks;
}

public class arrays {

    // ------------------- Regular Arrays
    public static void main(String[] args) {
        // int nums[] = { 3, 7, 2, 4 }; // you need to declare the the variable will be
        // an array by putting [] at the
        // // end of the variable name and insert the array data in the {}

        // nums[1] = 6; // this is how you change the value of an array

        // System.out.println("A value from Nums " + nums[1]);

        // int nums1[] = new int[4]; // This creates an array of 4 positions all with
        // the value of 0

        // nums1[0] = 4;
        // nums1[1] = 8;
        // nums1[2] = 3;
        // nums1[3] = 9;

        // System.out.println(nums1[0]);

        // for (int i = 0; i < nums1.length; i++) {
        // System.out.println("array position " + i + " is " + nums1[i]);
        // }

        // // ------------------ MultiDimensional Arrays

        // int nums2[][] = new int[3][4]; // to declare a variable as a
        // multi-dimensional array, you need to put [][] at
        // // the end of the variable name, then 'new int[here you declare the number of
        // // arrays][Here you declare the number of elements in the array]'

        // for (int i = 0; i < nums2.length; i++) { // This loop iterates through the
        // arrays
        // for (int j = 0; j < nums2[i].length; j++) { // This loop iterates through the
        // elements of the array
        // nums2[i][j] = (int) (Math.random() * 10); // this uses the iterations to
        // assigns a random number to the
        // // elements
        // }
        // }
        // for (int i = 0; i < nums2.length; i++) { // This loop iterates through the
        // arrays
        // for (int j = 0; j < nums2[i].length; j++) { // This loop iterates through the
        // elements of the array
        // System.out.println("Array # " + i + " element # " + j + " is " +
        // nums2[i][j]);
        // }
        // }

        // // -------------- Enhanced for loop

        // for (int n[] : nums2) {
        // for (int m : n) {
        // System.out.print(m + " ");
        // }
        // System.out.println();
        // }

        // // -------------- Jagged Array

        // int nums3[][] = new int[3][]; // the multi-dimensional array can still be
        // created even when the second number
        // // is missing, this is called a JAGGED ARRAY

        // nums3[0] = new int[3];
        // nums3[1] = new int[4];
        // nums3[2] = new int[2];

        // for (int i = 0; i < nums3.length; i++) {
        // for (int j = 0; j < nums3[i].length; j++) {
        // nums3[i][j] = (int) (Math.random() * 10);
        // }
        // }

        // for (int n[] : nums3) {
        // for (int m : n) {
        // System.out.print(m + " ");
        // }
        // System.out.println();
        // }

        // ------------------ Issues with arrays

        Student s1 = new Student();
        s1.rollnum = 1;
        s1.name = "Yusuf";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollnum = 2;
        s2.name = "Gabriel";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollnum = 3;
        s3.name = "Jasmine";
        s3.marks = 96;

        // System.out.println(s1.name + " : " + s1.marks);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].name + " : " + students[i].marks);
        // }

        // ------------- for each loop

        // int nums4[] = new int[4];

        // nums4[0] = 4;
        // nums4[1] = 8;
        // nums4[2] = 3;
        // nums4[3] = 9;

        // for (int i = 0; i < nums4.length; i++) {
        // System.out.println("array position " + i + " is " + nums4[i]);
        // }

        // for (int n : nums4) {
        // System.out.println(n);
        // }

        for (Student stud : students) {
            System.out.println(stud.name + " : " + stud.marks);
        }

    }
}
