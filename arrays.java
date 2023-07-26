public class arrays {

    // ------------------- Regular Arrays
    public static void main(String[] args) {
        int nums[] = { 3, 7, 2, 4 }; // you need to declare the the variable will be an array by putting [] at the
                                     // end of the variable name and insert the array data in the {}

        nums[1] = 6; // this is how you change the value of an array

        System.out.println("A value from Nums " + nums[1]);

        int nums1[] = new int[4]; // This creates an array of 4 positions all with the value of 0

        nums1[0] = 4;
        nums1[1] = 8;
        nums1[2] = 3;
        nums1[3] = 9;

        System.out.println(nums1[0]);

        for (int i = 0; i < nums1.length; i++) {
            System.out.println("array position " + i + " is " + nums1[i]);
        }

        // ------------------ MultiDimensional Arrays

        int nums2[][] = new int[3][4]; // to declare a variable as a multi-dimensional array, you need to put [][] at
                                       // the end of the variable name, then 'new int[here you declare the number of
                                       // arrays][Here you declare the number of elements in the array]'

        for (int i = 0; i < nums2.length; i++) { // This loop iterates through the arrays
            for (int j = 0; j < nums2[i].length; j++) { // This loop iterates through the elements of the array
                nums2[i][j] = (int) (Math.random() * 10); // this uses the iterations to assigns a random number to the
                                                          // elements
            }
        }
        for (int i = 0; i < nums2.length; i++) { // This loop iterates through the arrays
            for (int j = 0; j < nums2[i].length; j++) { // This loop iterates through the elements of the array
                System.out.println("Array # " + i + " element # " + j + " is " + nums2[i][j]);
            }
        }
    }
}
