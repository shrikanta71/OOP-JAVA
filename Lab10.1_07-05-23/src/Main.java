public class Main {

    public static void main(String[] args) {

        Ball b = new Ball("Kookaburra.");
        System.out.println("\nThe match will be played with " + b.getBrandName());
        b.toss();
        b.bounce();

        BaseBall b1 = new BaseBall("Wilson.");
        System.out.println("The match will be played with " + b1.getBrandName());
        b1.toss();
        b1.bounce();

        FootBall f1 = new FootBall("Nike.");
        System.out.println("The match will be played with " + f1.getBrandName());
        f1.toss();
        f1.bounce();

        Rock r1 = new Rock();
        r1.toss();
    }
}