public class shape {

    public void draw() {
        System.out.println("Draw the shape.");
    }

    public void erase() {
        System.out.println("Erase the shape.\n");
    }
}


class circle extends shape {
    public void draw() {
        System.out.println("Draw the Circle.");
    }

    public void erase() {
        System.out.println("Erase the Circle.\n");
    }
}


class triangle extends shape {
    public void draw() {
        System.out.println("Draw the Triangle.");
    }

    public void erase() {
        System.out.println("Erase the Triangle.\n");
    }
}


class square extends shape {
    public void draw() {
        System.out.println("Draw the Square.");
    }

    public void erase() {
        System.out.println("Erase the Square.");
    }
}

class Main {
    public static void main(String[] args) {

        circle c = new circle();
        c.draw();
        c.erase();

        triangle t = new triangle();
        t.draw();
        t.erase();

        square s = new square();
        s.draw();
        s.erase();
    }
}