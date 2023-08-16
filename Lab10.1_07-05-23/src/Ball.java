public class Ball implements Tossable {

    private String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void toss() {
        System.out.println("Toss to start playing BALL.");
    }

    public void bounce() {
        System.out.println("Bounce the BALL.\n\n");
    }
}
