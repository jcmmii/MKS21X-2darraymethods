public class ArrayMethods {
  public static int rowSum(int[][] ary, int x) {
    int sum = 0;
    if (x > ary.length) {
      return 0;
    }
    for (int y = 0; y < ary[x].length; y++) {
      sum = sum + ary[x][y];
    }
    return sum;
  }

  public static int columnSum(int[][] ary, int x) {
    int sum = 0;
    for (int y = 0; y < ary.length; y++) {
      for (int z = 0; z < ary[y].length; z++) {
        if (z == x) {
          sum = sum + ary[y][z];
        }
      }
    }
    return sum;
  }


  public static int[] allRowSums(int[][] ary) {
    int[] sum = new int[ary.length];
    for (int y = 0; y < ary.length; y++) {
        sum[y] = rowSum(ary, y);
      }
    return sum;
    }

  public static int longestAry(int[][] ary) {
    int temp = 0;
    int longest = 0;
    for (int y = 0; y < ary.length; y++) {
      for (int z = 0; z < ary[y].length; z++) {
        temp++;
      }
      if (temp > longest) longest = temp;
      temp = 0;
    }
    return longest;
  }

  public static int[] allColSums(int[][] ary) {
    int len = longestAry(ary);
    int sum[] = new int[len];
    for (int a = 0; a < sum.length; a++) {
      sum[a] = 0;
    }
    for (int b = 0; b < sum.length; b++) {
      sum[b] = columnSum(ary, b);
    }
    return sum;
  }

  }
