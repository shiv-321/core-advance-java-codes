package com.javapracticeshiv;

public class Ch_6_multidimentional_arrays {
    public static void main(String[] args) {
        // 1-D Array
        int[] flats;
        flats = new int[4];

        //2-D Array
        int[][] flats1;
        flats1 = new int[2][3];

        flats1[0][1] = 101;
        flats1[0][2] = 102;
        flats1[0][3] = 103;
        flats1[1][1] = 201;
        flats1[1][2] = 202;
        flats1[1][3] = 203;

        // Displaying the 2-D Array (for loop)
        for(int i = 0; i< flats1.length; i++){
            for(int j=0; j<flats1[i].length; j++){
                System.out.print(flats1[i][j]);
                System.out.print("");
            }
        }

    }


}
