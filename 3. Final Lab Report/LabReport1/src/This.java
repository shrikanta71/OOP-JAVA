public class This {
    private String name;
    private String id;

    public This(String name, String id){
        this.name = name;
        this.id = id;
    }

    public void display(){
        System.out.println(this.name + "\n" + this.id);
    }

    public static void main(String[] args) {
        This obj = new This("Shrikanta Paul", "221-15-4868");

        obj.display();
    }
}
