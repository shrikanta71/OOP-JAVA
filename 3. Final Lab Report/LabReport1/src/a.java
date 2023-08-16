public class a {

    public void function(){
        System.out.println("Can eat.");
    }
}


class b extends a{

    public void function(){
        System.out.println("Can fly.");
    }

    public static void main(String[] args) {
        b obj = new b();

        obj.function();
    }
}
