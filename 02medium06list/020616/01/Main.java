import java.util.Arrays;
import java.util.ArrayList;

class Main {
    public static void print2dArray(int[][] array2d) {
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.println(array2d[i][j]);
            }
        }
    }

    public static void print2dArrayDynamic(ArrayList<ArrayList<Integer>> array2d) {
        for (int i = 0; i < array2d.size(); i++) {
            for (int j = 0; j < array2d.get(i).size(); j++) {
                System.out.println(array2d.get(i).get(j));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> array2d = new ArrayList<ArrayList<Integer>>();
        array2d.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        array2d.get(0).add(34);
        array2d.get(0).add(346);
        array2d.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
        array2d.add(new ArrayList<Integer>(Arrays.asList(7, 8, 9)));

        int[][] fixedArray2d = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        print2dArrayDynamic(array2d);
        System.out.println("Printing fixed array...");
        print2dArray(fixedArray2d);
    }
}
