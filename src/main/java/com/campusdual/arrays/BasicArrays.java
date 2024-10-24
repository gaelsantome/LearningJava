package com.campusdual.arrays;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class BasicArrays {
    public static void main(String[] args) {
        int [] firstIntArray = new int[3];
        firstIntArray[0] = 15;
        firstIntArray[1] = 17;
        firstIntArray[2] = 19;
        String[] firstStringArray = {"A", "B", "C", "D"};

        System.out.println("First int array length "  + firstIntArray.length);
        System.out.println("First String array length "  + firstStringArray.length);

        System.out.println("First int array length position value "  + firstIntArray [0]);
        System.out.println("First String array length position value "  + firstStringArray[0]);

        System.out.println("Last int array length position value "  + firstIntArray [firstIntArray.length-1]);
        System.out.println("Last String array length position value "  + firstStringArray[firstStringArray.length-1]);

        System.out.println("Loop through first int array");
        for (int i = 0; i < firstIntArray.length; i++) {
            System.out.print(firstIntArray[i]+ " ");
        }
        System.out.println();

        System.out.println("Loop through String int array");
        for (int i = 0; i < firstStringArray.length; i++) {
            System.out.print(firstStringArray[i]+ " ");
        }
        System.out.println();

        int maxi = 30;
        int maxj = 30;
        int value = 0;
        int [] [] secondIntArray = new int [maxi][maxj];

        for (int i = 0; i < maxi ; i++) {
            for (int j = 0; j < maxj ; j++) {
                value++;
                secondIntArray[i][j]= value;
            }

        }
        for (int i = 0; i < maxi ; i++) {
            for (int j = 0; j < maxj; j++) {

                System.out.print(secondIntArray[i][j] + " ");
            }
            System.out.println();
        }
        String[][] secondStringArray= {{"A", "B", "C", "D"}, {"E", "F", "G", "H"}, {"I"," J", "K", "L"}};
        for (int i = 0; i < secondStringArray.length; i++) {
            for (int j = 0; j < secondStringArray[i].length; j++) {
                System.out.println(secondStringArray[i][j]+ " ") ;
            }
            System.out.println();
        }

    }
}
