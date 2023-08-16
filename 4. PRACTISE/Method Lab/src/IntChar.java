public class IntChar
{
    public void form(int n, char c)
    {
        System.out.println("Integer: " + n + "Character: " + c);
    }

    public void form(char c, int n)
    {
        System.out.println("Character: " + c + "Integer: " + n);
    }

    public static void main(String[] args)
    {
        IntChar obj = new IntChar();

        obj.form(10, 'S');
        obj.form('S', 10);

    }
}
