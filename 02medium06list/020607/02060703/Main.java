import java.util.ArrayList;

class Main {
    public static void main(String args[]) {
        ArrayList<String> fizzBuzzArrayList = fizzBuzz(45);

        printList(fizzBuzzArrayList);
    }

    public static ArrayList<String> fizzBuzz(int x) {
        ArrayList<String> fizzBuzzArrayList = new ArrayList<String>();
        for (int i = 1; i <= x; i++) {
            if (i % 15 == 0) {
                fizzBuzzArrayList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzzArrayList.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzzArrayList.add("Buzz");
            } else {
                String s = String.format("-%d-", i);
                fizzBuzzArrayList.add(s);
            }
        }
        return fizzBuzzArrayList;
    }

    public static void printList(ArrayList<String> intArr) {
        for (int i = 0; i < intArr.size(); i++) {
            System.out.println(intArr.get(i));
        }
    }
}
