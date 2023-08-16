public class ColourChecking {

    public static void main(String[] args) {

        int red = 193;
        int green = 255;
        int blue = 183;

        float r = red / 255f;
        float g = green / 255f;
        float b = blue / 255f;

        float hue;
        float saturation;
        float brightness;

        float cMax = Math.max(Math.max(r, g), b);
        float cMin = Math.min(Math.min(r, g), b);
        float delta = cMax - cMin;


        // Calculate Hue
        if (delta == 0) {
            hue = 0;
        }
        else if (cMax == r) {
            hue = ((g - b) / delta) % 6;
        }
        else if (cMax == g) {
            hue = (b - r) / delta + 2;
        }
        else {
            hue = (r - g) / delta + 4;
        }

        hue *= 60;
        if (hue < 0) {
            hue += 360;
        }

        // Calculate Brightness
        brightness = ((cMax + cMin) / 2) * 100;

        // Calculate Saturation
        if (r == g || g == b || b == r) {
            saturation = 0;
        }
        else if(brightness<128) {
            saturation = 255 * delta / (cMax + cMin);
        }
        else{
            saturation = 255 * delta / (511 - (cMax + cMin));
        }



        System.out.println("Hue: " + hue);
        System.out.println("Saturation: " + saturation);
        System.out.println("Brightness: " + brightness);
    }
}