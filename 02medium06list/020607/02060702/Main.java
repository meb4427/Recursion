import java.util.ArrayList;

class Main {
    public static void main(String args[]) {
        ArrayList<Integer> cubeRangeArrayList = cubeRange(3, 10);
        printList(cubeRangeArrayList);
    }

    public static ArrayList<Integer> cubeRange(int a, int b) {
        ArrayList<Integer> cubeRangeArrayList = new ArrayList<Integer>();
        for (int i = a; i <= b; i++) {
            cubeRangeArrayList.add(i * i * i);
        }
        return cubeRangeArrayList;
    }

    public static void printList(ArrayList<Integer> intArr) {
        for (int i = 0; i < intArr.size(); i++) {
            System.out.println(intArr.get(i));
        }
    }
}
