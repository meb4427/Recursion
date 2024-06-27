import java.util.ArrayList;
// import java.util.List;
// import java.util.Arrays;

class Main {
    public static void printArrayList(ArrayList<Integer> intArr) {
        for (int i = 0; i < intArr.size(); i++) {
            System.out.print(intArr.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        ArrayList<Integer> dArr = new ArrayList<Integer>();

        System.out.println("Initial ArrayList has 2 elements");
        dArr.add(2);
        dArr.add(3);
        printArrayList(dArr);

        System.out.println("inserting element into beginning of ArrayList");
        dArr.add(0, 3);
        printArrayList(dArr);

        System.out.println("overqriting element in index 1 to 100");
        dArr.set(1, 100);
        printArrayList(dArr);

        System.out.println("Adding 77 to middle of list");
        dArr.add((int) (Math.floor(dArr.size() / 2)), 77);
        printArrayList(dArr);

        System.out.println("adding 222 to the end of the list:");
        dArr.add(222);
        printArrayList(dArr);

        System.out.println("removing 222 from the end of the list:");
        dArr.remove(dArr.size() - 1);
        printArrayList(dArr);
    }
}
