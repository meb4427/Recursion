class RGB {
    int red;
    int green;
    int blue;

    public RGB(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    String getHexCode() {
        String hexRed = String.format("%2s", Integer.toHexString(this.red).replace(" ", "0"));
        String hexGreen = String.format("%2s", Integer.toHexString(this.green).replace(' ', '0'));
        String hexBlue = String.format("%2s", Integer.toHexString(this.blue).replace(' ', '0'));
        return "#" + hexRed + hexGreen + hexBlue;
    }

    String getBits() {
        String bitsRed = String.format("%4s", Integer.toBinaryString(this.red).replace(' ', '0'));
        String bitsGreen = String.format("%4s", Integer.toBinaryString(this.green).replace(' ', '0'));
        String bitsBlue = String.format("%4s", Integer.toBinaryString(this.blue).replace(' ', '0'));
        return bitsRed + bitsGreen + bitsBlue;
    }
}

class MyClass {
    public static void main(String[] args) {
        RGB color1 = new RGB(0, 153, 255);
        System.out.println(color1.getHexCode()); // #0099ff
        // System.out.println(color1.getBits()); // 1001100111111111
        // System.out.println(color1.getColorShade()); // blue

        RGB color2 = new RGB(255, 255, 204);
        System.out.println(color2.getHexCode()); // #ffffcc
        // System.out.println(color2.getBits()); // 111111111111111111001100
        // System.out.println(color2.getColorShade()); // red

        RGB color3 = new RGB(0, 87, 0);
        System.out.println(color3.getHexCode()); // #005700
        // System.out.println(color3.getBits()); // 101011100000000
        // System.out.println(color3.getColorShade()); // green

        RGB gray = new RGB(123, 123, 123);
        System.out.println(gray.getHexCode()); // #7b7b7b
        // System.out.println(gray.getBits()); // 11110110111101101111011
        // System.out.println(gray.getColorShade()); // grayscale
    }
}
