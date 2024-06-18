class Solution {
    public static int towerOfHanoi(int disks) {
        if (disks == 1) {
            return 1;
        } else {
            return 2 * towerOfHanoi(disks - 1) + 1;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(towerOfHanoi(1));
        System.out.println(towerOfHanoi(2));
        System.out.println(towerOfHanoi(3));
        System.out.println(towerOfHanoi(5));
        System.out.println(towerOfHanoi(10));
        System.out.println(towerOfHanoi(20));
    }
}
