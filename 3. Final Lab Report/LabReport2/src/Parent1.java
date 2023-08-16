import java.awt.*;

public interface Parent1 {
    void methOfP1();
}

interface Parent2{
    void methOfP2();
}

class Child implements Parent1, Parent2{

    public void methOfP1(){
        System.out.println("Method of parent1.");
    }

    public void methOfP2() {
        System.out.println("Method of parent2.");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.methOfP1();
        obj.methOfP2();
    }
}