public interface A {

    void meth1();
    void meth2();
}

class MyClass implements A{

    public void meth1(){
        System.out.println("Meth1.");
    }

    public void meth2(){
        System.out.println("Meth2.");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.meth1();
        obj.meth2();
    }
}

