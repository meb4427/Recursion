class Solution {
    public static int oppositeSeat(int seat, int len) {
        return len * 2 + 1 - seat;
    }

    public static void main(String[] args) {
        System.out.println(oppositeSeat(3, 5));
        System.out.println(oppositeSeat(1, 5));
        System.out.println(oppositeSeat(8, 5));
        System.out.println(oppositeSeat(758, 699));
        System.out.println(oppositeSeat(109, 5201));
        System.out.println(oppositeSeat(355, 903));
        System.out.println(oppositeSeat(963, 717));
    }
}
