package ex_26Aug2025;

import java.util.Scanner;

public class Sept1_Part2 {
    public static void main(String[] args) {
        int [][] array_2d = {{1,2},{3,4},{5,6}};
// Searching from a 2D array
        for(int row=0; row < array_2d.length; row++){
            for(int col=0; col<array_2d[0].length; col++){
                if(array_2d[row][col]==5){
                    System.out.println("Row is " + row);
                    System.out.println("Column is " + col);
                    break;
                }
            }
        }

// Print row1 followed by row2 and then row3
//        for(int row = 0; row < array_2d.length; row++){
//            for(int col = 0; col < array_2d[0].length; col++){
//                System.out.println(array_2d[row][col]);
//            }
//        }
// Print column1 data followed by column2
//        for(int col=0; col<array_2d[0].length; col++){
//            for(int row=0; row<array_2d.length; row++){
//                System.out.println(array_2d[row][col]);
//            }
//        }

//  Right triangle star pattern
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int rows_col = sc.nextInt();
//        System.out.println("Now see the magic!! Haha!!");
//        for(int row=0; row<rows_col; row++){
//            for(int col=0; col<=row; col++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//  Left triangle star pattern
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int rows_col = sc.nextInt();
//        System.out.println("Now see the magic!! Haha!!");
//        for(int row=0; row<rows_col; row++){
//            for(int col=0; col<rows_col; col++){
//                if(col < row){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println("");
//        }

    }
}
