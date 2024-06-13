class Solution {
    public static String twoPaths(String path1, String path2) {
        boolean path1slash = path1.lastIndexOf('/') == path1.length() - 1;
        boolean path2slash = path2.indexOf('/') == 0;

        if (path1slash && path2slash) {
            return path1 + path2.substring(1);
        } else if (!path1slash && !path2slash) {
            return path1 + "/" + path2;
        } else {
            return path1 + path2;
        }
    }

    public static void main(String[] args) {
        System.out.println(twoPaths("path1", "path2")); // path1/path2
        System.out.println(twoPaths("path1/", "path2")); // path1/path2
        System.out.println(twoPaths("path1", "/path2")); // path1/path2
        System.out.println(twoPaths("path1/", "/path2")); // path1/path2
        System.out.println(twoPaths("et", "/quisquam")); // et/quisquam
        System.out.println(twoPaths("nam/", "/recusandae")); // nam/recusandae
        System.out.println(twoPaths("expedita/", "non")); // expedita/non
        System.out.println(twoPaths("pariatur", "/dolor")); // pariatur/dolor
    }
}
