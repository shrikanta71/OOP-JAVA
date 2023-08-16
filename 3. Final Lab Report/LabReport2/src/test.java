public interface test {
    void square();
}

class arithmetic implements test{

    public void square(){
        System.out.println("This is square from arithmetic class.");
    }
}

class ToTestInt extends arithmetic{
    public static void main(String[] args) {
        arithmetic obj = new arithmetic();
        obj.square();
    }
}