public class BaseBall extends Ball {

    public BaseBall(String brandName) {
        super(brandName);
    }

    public void toss() {
        System.out.println("Toss to start playing BASEBALL.");
    }

    public void bounce() {
        System.out.println("Bounce the BASEBALL.\n\n");
    }
}
