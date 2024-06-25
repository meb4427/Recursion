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
        return String.format("#%02x%02x%02x", this.red, this.green, this.blue);
    }

    String getBits() {
        String bitsRed = String.format("%8s", Integer.toBinaryString(this.red)).replace(' ', '0');
        String bitsGreen = String.format("%8s", Integer.toBinaryString(this.green)).replace(' ', '0');
        String bitsBlue = String.format("%8s", Integer.toBinaryString(this.blue)).replace(' ', '0');

        String bits = bitsRed + bitsGreen + bitsBlue;
        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '1') {
                bits = bits.substring(i);
                break;
            }
        }
        return bits;
    }

    String getColorShade() {
        if (this.red == this.green && this.red == this.blue) {
            return "grayscale";
        } else if (this.red >= this.green && this.red >= this.blue) {
            return "red";
        } else if (this.green >= this.red && this.green >= this.blue) {
            return "green";
        } else {
            return "blue";
        }
    }
}

class MyClass {
    public static void main(String[] args) {
        RGB color1 = new RGB(0, 153, 255);
        System.out.println(color1.getHexCode()); // #0099ff
        System.out.println(color1.getBits()); // 1001100111111111
        System.out.println(color1.getColorShade()); // blue

        RGB color2 = new RGB(255, 255, 204);
        System.out.println(color2.getHexCode()); // #ffffcc
        System.out.println(color2.getBits()); // 111111111111111111001100
        System.out.println(color2.getColorShade()); // red

        RGB color3 = new RGB(0, 87, 0);
        System.out.println(color3.getHexCode()); // #005700
        System.out.println(color3.getBits()); // 101011100000000
        System.out.println(color3.getColorShade()); // green

        RGB gray = new RGB(123, 123, 123);
        System.out.println(gray.getHexCode()); // #7b7b7b
        System.out.println(gray.getBits()); // 11110110111101101111011
        System.out.println(gray.getColorShade()); // grayscale
    }
}
