import java.util.Arrays;
public class ArrDrive{
  public static void main(String[] args) {

    //part I
    System.out.println("Part I");
    int[][] ary = new int[5][5];
    System.out.println("Initial array: ");
    ArrayMethods.printArray(ary);
    System.out.println("Setting first line to all 4s");
    for (int i = 0; i < ary.length; i++)
      ary[0][i] = 4;
    ArrayMethods.printArray(ary);
    System.out.println("Sum of first row(20): " + ArrayMethods.rowSum(ary,0));

    System.out.println("Setting column 2 to 5,10,6,5,7");
    ary[1][1] = 10;
    ary[2][1] = 6;
    ary[3][1] = 5;
    ary[4][1] = 7;
    ArrayMethods.printArray(ary);
    System.out.println("Sum of second column(32): " + ArrayMethods.columnSum(ary,1));

    //part II
    System.out.println("\nPart II");
    System.out.println("Changing up array:");
    for (int i = 0; i < ary.length; i++){
      ary[1][i] = 3;
      ary[2][i] = 6;
      ary[3][i] = 5;
    }
    ary[4][0] = 1;
    ary[4][3] = 8;
    ArrayMethods.printArray(ary);
    System.out.println("Sum of all rows(20,15,30,25,16): " + Arrays.toString(ArrayMethods.allRowSums(ary)));
    System.out.println("Sum of all columns(19,25,18,26,18): " + Arrays.toString(ArrayMethods.allColSums(ary)));

    //part III
    System.out.println("\nPart III");
    System.out.println("New array:");
    int[][] ary2 = new int[3][];
    ary2[0]= new int[]{22,13};
    ary2[1]= new int[]{1,3,5,7,9,10};
    ary2[2]= new int[]{35,0};
    ArrayMethods.printArray(ary2);
    System.out.println("Row magic? (yes,sum of all rows is 35): " + ArrayMethods.isRowMagic(ary2));

    System.out.println("New array:");
    int[][] ary3 = new int[4][];
    ary3[0] = new int[]{1,5,3,7,9,9};
    ary3[1] = new int[]{3,1,5,2};
    ary3[2] = new int[]{5,3,1};
    ary3[3] = new int[]{};
    ArrayMethods.printArray(ary3);
    System.out.println("Column magic? (yes,sum of all columns is 9): " + ArrayMethods.isColumnMagic(ary3));
  }
}
