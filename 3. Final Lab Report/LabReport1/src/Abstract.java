public abstract class Abstract {

    public abstract void method1();

    public void method2(){
        System.out.println("Method 2.");
    }
}

class NonAbstract extends Abstract{

    public void method1(){
        System.out.println("Method 1.");
    }

    public static void main(String[] args) {
        NonAbstract obj = new NonAbstract();
        obj.method1();
        obj.method2();
    }
}