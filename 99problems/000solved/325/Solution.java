class Solution {
    public static String getSlug(String url) {
        int slashIndex = url.lastIndexOf('/');
        if (slashIndex == url.length() - 1) {
            url = url.substring(0, slashIndex);
            slashIndex = url.lastIndexOf('/');
        }
        return url.substring(slashIndex + 1);
    }

    public static void main(String[] args) {
        System.out.println(getSlug("recursionist.io/img")); // img
        System.out.println(getSlug("recursionist.io/img/bear.png")); // bear.png
        System.out.println(getSlug("http://recursionist.io/img/")); // img
        System.out.println(getSlug("recursionist.io/img/bear.png")); // bear.png
        System.out.println(getSlug("http://lemke.biz/dolores-vel-voluptate-quis-sapiente-beatae-quia.html")); // dolores-vel-voluptate-quis-sapiente-beatae-quia.html
    }
}
