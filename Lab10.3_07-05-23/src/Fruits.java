public abstract class Fruits {

    String color;

    public Fruits(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    abstract void display();
}
