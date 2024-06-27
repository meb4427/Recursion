import java.util.ArrayList;

class Main {
    public static void main(String args[]) {
        int[] zipcodeArr = { 50013, 94512, 90080, 90190, 90095, 54810, 85005 };
        ArrayList<Integer> ZipCodesMatched = zipcodeRange(zipcodeArr, 90094, 200);

        for (int i = 0; i < ZipCodesMatched.size(); i++) {
            System.out.println(ZipCodesMatched.get(i));
        }
    }

    public static ArrayList<Integer> zipcodeRange(int[] listOfZipcodes, int mainZip, int zipRange) {
        ArrayList<Integer> ZipCodesMatched = new ArrayList<Integer>();
        for (int i = 0; i < listOfZipcodes.length; i++) {
            if (Math.abs(listOfZipcodes[i] - mainZip) <= zipRange) {
                ZipCodesMatched.add(listOfZipcodes[i]);
            }
        }
        return ZipCodesMatched;
    }
}
